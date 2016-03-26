package com.ch6.hashing;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.ch6.hashing.vo.Person;

public class TestHashSet {

	void execute() {
		/*Set<Person> hSet = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person lhs, Person rhs) {
				// TODO Auto-generated method stub

				return rhs.getName().compareTo(lhs.getName());

			}
		});*/
		
		
		Set<Person> hSet = new LinkedHashSet<>();
		 
		//hSet.add(null);
		
		for (int i = 1; i < 18; i++) {
			Person p1 = new Person();
			p1.setAge(i);
			p1.setName("TEST " + i);
			String gender = i % 2 == 0 ? "M" : "F";
			p1.setGender(gender);
			hSet.add(p1);			
		}
		
		int i = 1;
		Person p1 = new Person();
		p1.setAge(i);
		p1.setName("TEST " + i);
		String gender = i % 2 == 0 ? "M" : "F";
		p1.setGender(gender);
		hSet.add(p1);
		
		
		Person p2 = new Person();
		p2.setAge(i);
		p2.setName("TEST " + i);
		gender = i % 2 == 0 ? "M" : "F";
		p2.setGender(gender);		
		hSet.add(p2);
		
		System.out.println(hSet);

	}

	public static void main(String[] args) {
		TestHashSet set = new TestHashSet();
		set.execute();
	}
}
