package com.tejakathari.multithreading;

public class ThreadCreationImplementingRunnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Switching to new Thread: " + Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
			}
		});

		thread.setName("New-Thread-111");
		thread.setPriority(Thread.MAX_PRIORITY);

		// When a runtime exception or unhandled exception happens it will bring down
		// the entire application, to avoid that we set a default handler for each
		// thread
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out
						.println("A unhandled exception is caught: " + e.getMessage() + " for thread: " + t.getName());
			}
		});

		System.out.println("we are in the thread before starting: " + Thread.currentThread().getName());
		thread.start();
		System.out.println("we are in the thread after starting: " + Thread.currentThread().getName());

	}

}
