package com.bigob.MultiThreading;

public class ThreadDemo  extends Thread{
	private String methodName;
	public ThreadDemo(String methodName) {
		this.methodName=methodName;
	}
	@Override
	public void run() {
		System.out.println(methodName);
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		System.out.println("...............................");
	}
}
