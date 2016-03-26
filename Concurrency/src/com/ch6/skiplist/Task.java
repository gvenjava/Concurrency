package com.ch6.skiplist;

import java.util.concurrent.ConcurrentSkipListMap;

public class Task implements Runnable {

	private String id;
	private ConcurrentSkipListMap<String, Contact> map;

	public Task(String id, ConcurrentSkipListMap<String, Contact> list) {
		this.id = id;
		this.map = list;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			Contact c = new Contact(id, String.valueOf(i + 1000));
			map.put(id + c.getPhone(), c);
		}

	}

}
