package com.bharath.newInterface;

public abstract class AbstractClass {
	
	AbstractClass(){
		System.out.print("The only difference between the Java 8 Interface and Abstract class is ");
		System.out.println("that interface cannot have constructor where as an AbstractClass can have constructor ");
	}
	
	static void dance() {
		System.out.println("I am dancing ");
	}
	
	abstract void danceMore();

}
