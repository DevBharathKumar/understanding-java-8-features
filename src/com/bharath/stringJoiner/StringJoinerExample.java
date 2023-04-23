package com.bharath.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample 
{
	public static void main(String[] args) 
	{
		StringJoiner joiner = new StringJoiner(",");
		
		System.out.println("Empty string joiner - "+joiner);
		
		joiner.add("Bharath");
		joiner.add("Reethi");
		joiner.add("Abi");
		
		System.out.println("After adding string - "+joiner);
		
		StringJoiner joinerPS = new StringJoiner(",", "[", "]");

		joinerPS.add("Rakesh");
		joinerPS.add("Abdul");
		joinerPS.add("Arun pandiyan");
		
		System.out.println("String with prefix and suffix - "+joinerPS);
		
		StringJoiner joinerPS2 = new StringJoiner(" <-> ", "||", "||");
		
		joinerPS2.add("Bharath");
		joinerPS2.add("Reethi");
		joinerPS2.add("Abi");
		
		//This line joins the list from joinerPS2 to joinerPS with the delimiter "<->" 
		//but will ignore the prefix "||" and suffix "||"
		joinerPS.merge(joinerPS2);
		
		System.out.println("String with prefix and suffix 2 - "+joinerPS2);
		
		System.out.println("String with prefix and suffix - "+joinerPS);
		
		String str = joinerPS.toString();
		
		System.out.println("After string conversion - "+str);
		System.out.println("Performs string operations - "+str.contains("Abi"));
		System.out.println("Performs string operations - "+str.length());
		
	}
}
