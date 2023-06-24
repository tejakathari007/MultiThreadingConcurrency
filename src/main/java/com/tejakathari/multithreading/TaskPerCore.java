package com.tejakathari.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskPerCore {

	public static void main(String[] args) {
		
		int coreCount=Runtime.getRuntime().availableProcessors();
		System.out.println("No of cores in this machine: "+coreCount);
		ExecutorService ex = Executors.newFixedThreadPool(coreCount);

		for (int i = 0; i < 10; i++) {
			ex.execute(new IOTask());
		}

	}

	public static class IOTask implements Runnable {
		public void run() {
			System.out.println("Thread Name: "+Thread.currentThread().getName());
		}
	}
}
