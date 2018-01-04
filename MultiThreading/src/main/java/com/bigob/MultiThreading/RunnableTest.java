package com.bigob.MultiThreading;

public class RunnableTest {

	public static void main(String[] args) {
		Thread t1;
		Runnable t2;
		t1 = new ThreadDemo("t1");
		t1.start();

		t2 = new ThreadDemo1();
		/*
		 * t2.run(); we need to create a thread because we need to call
		 * start()	So Thread class have a parameter to pass the Runnable
		 * interface object or it sub class object
		 */
		new Thread(t2).start();
	}
}
