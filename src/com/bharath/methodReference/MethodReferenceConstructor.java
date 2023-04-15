package com.bharath.methodReference;

public class MethodReferenceConstructor 
{
//	Messageable is a functional interface with a single abstract method getMessage(String msg), which takes a String argument and returns a Message object.
//
//	Message::new is a constructor reference that refers to the constructor of the Message class. 
//	The constructor takes a single String argument and initializes the Message object with that value.
//
//	When you assign Message::new to hello, you are effectively creating a lambda expression that implements the Messageable interface. 
//	The lambda expression creates a Message object using the Message constructor that takes a String argument and returns it.
//
//	When you call hello.getMessage("Hello"), the lambda expression is invoked, which in turn calls the Message constructor with the argument "Hello". 
//	This creates a new Message object with the message "Hello", which is printed to the console. 
//	So, the Message object is created when you call hello.getMessage("Hello")	
	
	public static void main(String[] args) 
	{
		Messageable messageable = Message::new;
		messageable.getMessage("This object is created by a lambda expression ");
	}
}
