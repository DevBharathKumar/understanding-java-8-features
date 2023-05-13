package com.bharath.optional.realTimeCaseCheck;

public class Customer 
{
	private String name;
	private Double age;
	
	public Customer(String name, Double age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}
	
}
