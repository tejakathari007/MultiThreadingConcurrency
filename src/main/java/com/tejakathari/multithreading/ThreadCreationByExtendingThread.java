package com.tejakathari.multithreading;

//@SpringBootApplication
public class ThreadCreationByExtendingThread {

	public static void main(String[] args) {
		TempThread temp = new TempThread();
		temp.start();
	}

	private static class TempThread extends Thread {
		@Override
		public void run() {
			// Advantage to get this. instead of static Thread
			System.out.println("Switching to new Thread: " + this.getName());
		}
	}

}
