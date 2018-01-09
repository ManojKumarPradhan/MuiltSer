package com.bigob.Producer_consumer;

import java.util.List;

public class Consumer implements Runnable{

	private List<Integer> list=null;
	
	public Consumer(List<Integer> list) {
		this.list=list;
	}
	@Override
	public void run() {
		while(true){
			try {
				consumer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void consumer() throws InterruptedException{
		synchronized (list) {
			while(list.isEmpty()){
				System.out.println("Waiting for the Item.....");
				list.wait();
			}
		}
		synchronized (list) {
			Thread.sleep(1000);
			System.out.println("Removing the element\t:\t"+list.remove(0));
			list.notify();
		}
	}

}
