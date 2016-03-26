package com.lrucache;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestLinkedHashMap {

	public static void main(String[] s) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>(10,0.75f,true);
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
		map.get("3");
		map.get("2");
		map.get("1");
		
		for (Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext();) {
			String type = (String)iterator.next();
			System.out.println(type);
			
		}
	}
}
