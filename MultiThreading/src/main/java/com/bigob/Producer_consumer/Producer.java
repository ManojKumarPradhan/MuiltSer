package com.bigob.Producer_consumer;

import java.util.List;

public class Producer implements Runnable {

	private List<Integer> list = null;
	final Integer SIZE = 5;
	private Integer i = 1;

	public Producer(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		while (true) {
			try {
				produce(i++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void produce(Integer i) throws InterruptedException {
		synchronized (list) {
			while (list.size() == SIZE) {
				System.out.println("Item full please call to Consumer");
				list.wait();
			}
		}
		synchronized (list) {
			System.out.println("Adding Item in Store\t:\t" + i);
			Thread.sleep(1000);
			list.add(i);
			list.notify();
		}
	}
}
