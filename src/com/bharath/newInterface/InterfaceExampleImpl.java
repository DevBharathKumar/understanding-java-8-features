package com.bharath.newInterface;

public class InterfaceExampleImpl implements InterfaceExample
{

	@Override
	public void saySomething() {
		System.out.println("Inside overrided method of the implemented class");
	}	
	
	public static void main(String[] args) 
	{
		InterfaceExampleImpl impl = new InterfaceExampleImpl();
		
		impl.say();
		
		InterfaceExample.sayMore();
		
		impl.saySomething();
	}
}
