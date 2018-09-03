package com.xiong.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import com.xiong.exception.OJException;
import com.xiong.exception.MemoryoutException;
import com.xiong.callback.*;

public class OJ {
	private ForkJoinPool pool;
	private String result = "";
	static Runtime p = null;
	String mark;

	OJ(String mark) {
		this.mark = mark;
	}

	public static Runtime getProcess() {
		return p;
	}

	String writeFile(String code) {
		FileOutputStream fop = null;
		File file;
		String content = code;
		try {
			file = new File("D:/Microsoft Visual Studio 6.0/VC98/Bin/code/" + "a.c");
			fop = new FileOutputStream(file);
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();
			return "YES";
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "NO";
	}

	String compile(String code) {
		if (writeFile(code).equals("NO"))
			return "NO";
		String var[] = { "Include=D:/Microsoft Visual Studio 6.0/VC98/Include;",
				"Lib=C:/Program Files (x86)/Microsoft SDKs/Windows/v7.1A/Lib;D:/Microsoft Visual Studio 6.0/VC98/Lib" };
		String cmd[] = { "D:/Microsoft Visual Studio 6.0/VC98/Bin/cl.exe",
				"D:/Microsoft Visual Studio 6.0/VC98/Bin/code/" + "a.c" };
		Process pro;
		try {
			pro = Runtime.getRuntime().exec(cmd, var);
			BufferedReader br = new BufferedReader(new InputStreamReader(pro.getInputStream()));
			String readLine = br.readLine();
			String result = "";
			while (readLine != null) {
				result += readLine;
				System.out.println(readLine);
				readLine = br.readLine();
			}
			if (!result.contains("error")) {
				return "YES";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "NO";
	}

	String execute(String code, Exchanger<Runtime> ex, String input, String output) {
		try {
			if (compile(code).equals("YES")) {
				String var2[] = { "Include=C:/Program Files/Microsoft Visual Studio 10.0/VC/include;",
						"Lib=C:/Program Files/Microsoft Visual Studio 10.0/VC/lib;C:/Program Files/Microsoft SDKs/Windows/v7.0A/Lib;" };
				p = Runtime.getRuntime();
				String[] cmd = { "a.exe", input };
				Process s = p.exec(cmd, var2);
				BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String readLine2 = br2.readLine();
				String result = "";
				while (readLine2 != null) {
					result += readLine2;
					readLine2 = br2.readLine();
				}
				if (!result.equals(output)) {
					return "WRONG ANSWER";
				}

			} else {
				return "ERROR IN PARAM";
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "YES";
	}

	class OJExecuteRecursiveTask extends RecursiveTask<String> {
		Callback callback;
		String code;
		Exchanger<Runtime> ex;
		String input;
		String output;

		public OJExecuteRecursiveTask(Callback callback, String code, Exchanger<Runtime> ex, String input,
				String output) {
			this.callback = callback;
			this.code = code;
			this.ex = ex;
			this.input = input;
			this.output = output;
		}

		private static final long serialVersionUID = 1L;

		@Override
		public String compute() {
			String result = execute(code, ex, input, output);
			this.callback.callback(result);
			throw new OJException();
		}
	}

	class MemoryOutRecursiveTask extends RecursiveTask<String> {
		Long timeLimit, memoLimit;
		private static final long serialVersionUID = 1L;
		Exchanger<Runtime> ex;

		public MemoryOutRecursiveTask(Long timeLimit, Long memoLimit, Exchanger<Runtime> ex) {
			this.timeLimit = timeLimit;
			this.memoLimit = memoLimit;
			this.ex = ex;
		}

		@Override
		public String compute() {
			long time = System.currentTimeMillis();
			long begin = 0L;
			long end = 0;

			while (true) {
				if (System.currentTimeMillis() - time >= timeLimit) {
					// throw new MemoryoutException();
					break;
				} else {
					if (OJ.getProcess() != null) {
						end = OJ.getProcess().totalMemory() - OJ.getProcess().freeMemory();
						if (end - begin > memoLimit) {
							throw new MemoryoutException();
						}
					}

				}
			}
			return "dd";
		}

	}

	String run(String code, Long timeLimit, Long memoLimit, OJ ojj, String input, String output) {
		ForkJoinTask<String> m = null;
		ForkJoinTask<String> o = null;
		Exchanger<Runtime> ex = new Exchanger<Runtime>();
		try {
			pool = new ForkJoinPool();
			MemoryOutRecursiveTask memory = new MemoryOutRecursiveTask(timeLimit, memoLimit, ex);

			OJExecuteRecursiveTask oj = new OJExecuteRecursiveTask(new Callback() {
				@Override
				public void callback(String r) {
					result = r;
				}

			}, code, ex, input, output);
			o = pool.submit(oj);
			m = pool.submit(memory);
			m.get();
			o.get(timeLimit, TimeUnit.MILLISECONDS);

		} catch (ExecutionException i) {
			if (m.getException() instanceof MemoryoutException) {
				o.cancel(true);
				if (o.isCancelled()) {
					System.out.println("o is cancelled");
				} else {
					System.out.println("o is not cancelled");
				}
				return "MEMORYOUT";
			} else if (o.getException() instanceof OJException) {

				if (result.equals("YES")) {
					return "ACCEPTED";
				} else {
					return result;
				}
			}
		} catch (TimeoutException t) {
			return "TIMEOUT";
		} catch (InterruptedException i) {

		} finally {
			try {
				Runtime.getRuntime().exec("taskkill /im a.exe /f");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			MyThreadExecutor.putOJ(ojj);
		}

		return "WRONG";
	}
}
