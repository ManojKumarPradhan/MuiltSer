package com.bigob.MultiThreading;

public class App {
    public static void main( String[] args ){
    	Thread t1,t2;
    	t1=new ThreadDemo("t1");
    	t1.start();
    	t2=new ThreadDemo("t2");
    	t2.run();
    	
    	/*
    	 * So what is the different between start() and a run()
    	 * 
    	 * As we know every class run on a thread called main 
    	 * so here when we create a thread t1 and t2 it is created in main thread
    	 * so when we called run() it actually run in main thread so there is no print 
    	 * to create a thread object if we want to invoke run()
    	 * 
    	 *  BUT
    	 *  
    	 *  if we call start() internally it call start0() which is responsible to create a Thread
    	 *  and with that thread it will call run()
    	 * 
    	 * */
    }
}

