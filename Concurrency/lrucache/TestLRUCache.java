package com.lrucache;

import java.util.Map;

public class TestLRUCache {

	public static void main(String[] args) {
		LRUCache<String,String> cache = new LRUCache<String,String>(3);
		cache.put("1","One");
		cache.put("2","One");
		cache.put("3","One");
		
		
		cache.put("4","One");
		cache.put("5","One");
		cache.get("1");
		cache.get("2");
		cache.get("4");
		
		
		
		for(Map.Entry<String, String> entry : cache.getAllEntries()){
			
			System.out.printf("KEY = %s, VALUE = %s%n",entry.getKey(),entry.getValue());
		}
		
	}

}
