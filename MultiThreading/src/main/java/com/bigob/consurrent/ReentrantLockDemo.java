package com.bigob.consurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockDemo {

	public static void main(String[] args) {
		a((float)99.9);
		
		Lock lock=new ReentrantLock();
		ReentrantReadWriteLock.ReadLock lock2=null;
	}
	static void a(float f){
		System.out.println(f);
	}
	static void a(double f){
		System.out.println(f+"double");
	}
	
}
