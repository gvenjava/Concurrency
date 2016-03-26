package com.ch6.hashing.vo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
//implements Comparable<Person>
public class Person  {

	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/*@Override
	public int hashCode() {

		return new HashCodeBuilder().append(this.name).append(this.age)
				.append(this.gender).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;

		if (obj instanceof Person) {
			Person rhs = (Person) obj;
			result = new EqualsBuilder().append(this.name, rhs.getName())
					.append(this.age, rhs.getAge())
					.append(this.gender, rhs.getGender()).isEquals();
		}

		return result;

	}*/

	@Override
	public String toString() {

		int pos = 16 % hashCode();

		String str = String.format(
				"Name : %s, Age : %d, Gender : %s, Position : %d%n", this.name,
				this.age, this.gender, pos);

		return str;
	}

	/*@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub

		return o.getGender().compareTo(this.getGender());

	}*/

}
