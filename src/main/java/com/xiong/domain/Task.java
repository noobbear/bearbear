package com.xiong.domain;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {
	String code;
	Long timeLimit, memoLimit;
	String input, output;

	public Task(String code, Long timeLimit, Long memoLimit, String input, String output) {
		this.code = code;
		this.timeLimit = timeLimit;
		this.memoLimit = memoLimit;
		this.input = input;
		this.output = output;
	}

	@Override
	public String call() {

		OJ oj = MyThreadExecutor.getOJ();
		String result = oj.run(code, timeLimit, memoLimit, oj, input, output);

		return result;
	}

}