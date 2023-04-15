package com.bharath.optional;

import java.util.Optional;

public class OptionalExample 
{
	public static void main(String[] args) 
	{
		String[] s = new String[10];
		
		//Code will throw null pointer exception
		//System.out.println(s[5].toLowerCase());
		
		//This will throw null pointer exception since it requires a not null value to be passed as an argument
		//Optional<String> optional1 = Optional.of(s[5]);
		
		Optional<String> optional = Optional.ofNullable(s[5]);
		
		if(optional.isPresent()) {
			System.out.println(s[5].toLowerCase());
		} else {
			System.out.println("Array does not contain value at 5");
		}
		
		s[5] = "THIS IS A TEST STRING";
		
		Optional<String> opt = Optional.ofNullable(s[5]);
		
		if(opt.isPresent()) {
			System.out.println("One way - "+s[5].toLowerCase());
			System.out.println("Second way - "+opt.get().toLowerCase());
		}
		
		//Alternative way of printing
		opt.ifPresent(System.out::println);
		
	}
}
