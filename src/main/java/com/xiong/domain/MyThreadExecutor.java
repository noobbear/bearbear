package com.xiong.domain;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadExecutor {
	private static ThreadPoolExecutor executor;
	private static LinkedBlockingQueue<OJ> queue;
	private static OJ oj;
	private static OJ oj2;
	static {
		executor = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 0, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		queue = new LinkedBlockingQueue<OJ>(2);
		oj = new OJ("jiji");
		oj2 = new OJ("yaya");
		queue.add(oj);
		// queue.add(oj2);
	}

	public static ThreadPoolExecutor getThreadExecutor() {
		synchronized (MyThreadExecutor.class) {
			return executor;
		}
	}

	public static OJ getOJ() {
		return queue.poll();
	}

	public static void putOJ(OJ oj) {
		queue.add(oj);
	}

}
