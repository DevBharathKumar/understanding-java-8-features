package com.bharath.newInterface;

public interface InterfaceExample {
	
	default void say() {
		System.out.println("Hi I am a NON STATIC method inside the interface");
	}
	
	static void sayMore() {
		System.out.println("Hi I am a STATIC method inside the interface");
	}
	
	public void saySomething();

}
