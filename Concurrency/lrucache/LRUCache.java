package com.lrucache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> {
	public final float loadFactor = 0.75f;
	private int cacheSize;
	private LinkedHashMap<K, V> map;
	
	public LRUCache(int size) {
		this.cacheSize = size; 
		int initialCapacity = (int) (Math.ceil(cacheSize / loadFactor)+1);
//		System.out.println(totalCapacity);
		map = new LinkedHashMap<K, V>(initialCapacity,loadFactor,true){
			private static final long serialVersionUID = 1L;
			
			@Override
			protected boolean removeEldestEntry(Map.Entry<K,V> eldest){				
				return size() > LRUCache.this.cacheSize;
			}		
		};
	}
	
	public synchronized V get(K key){
		return this.map.get(key);
	}
	
	public synchronized void put(K key, V value){
		this.map.put(key, value);
	}
	
	public synchronized Collection<Map.Entry<K, V>> getAllEntries(){
		return new ArrayList<Map.Entry<K, V>>(map.entrySet());
	}
	
	public synchronized int size(){
		return this.map.size();
	}
	
}
