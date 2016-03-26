package com.ch6.skiplist;

import java.util.Map;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class Main {

	public static void main(String[] args) {
		ConcurrentSkipListMap<String, Contact> map = new ConcurrentSkipListMap<>();

		Thread[] t1 = new Thread[25];

		int count = 0;
		for (char i = 'A'; i < 'Z'; i++) {
			t1[count] = new Thread(new Task(String.valueOf(i), map));
			t1[count].start();
			count++;
		}

		for (int i = 0; i < t1.length; i++) {
			try {
				t1[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// System.out.printf("SIZE OF MAP %d%n, %s", map.size(), map);
		Map.Entry<String, Contact> entry = map.firstEntry();
		System.out.printf("VALUE FROM MAP %s%n", entry.getValue());

		ConcurrentNavigableMap<String, Contact> subMap = map.subMap("B1145",false,
				"N1732",false);

		System.out.printf("SIZE OF SUB MAP %d%n, %s", subMap.size(), subMap);

	}
}
