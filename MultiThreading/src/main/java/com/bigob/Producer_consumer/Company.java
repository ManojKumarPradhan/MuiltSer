package com.bigob.Producer_consumer;

import java.util.ArrayList;
import java.util.List;

public class Company {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		Thread producer=new Thread(new Producer(list));
		Thread consumer=new Thread(new Consumer(list));
		
		producer.start();
		
		consumer.start();
	}
}
