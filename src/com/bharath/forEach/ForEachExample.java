package com.bharath.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ForEachExample 
{
	public static void main(String[] args) 
	{
		List<String> places = new ArrayList<>();
		places.add("Chennai");
		places.add("Mumbai");
		places.add("Delhi");
		places.add("Kolkata");
		places.add("Pune");
		
		System.out.println("The places I have visted are as follows : ");
		
		//int i =0; Cannot use this to increment inside the loop because forEach method does not allows this.
		//Global variable should be effectively final
		AtomicInteger noOfPlace = new AtomicInteger(1);
		places.forEach(
					(place) -> {
						System.out.println(noOfPlace.getAndIncrement()+" "+place);
					}
				);
		
		System.out.println("----------------- Alternative way of printing ------------------");
		
		//Another approch of printing the list
		places.forEach(System.out::println);
		
		System.out.println("------------------ Getting the details from global object ---------------------");
		
		UIData uidata = new UIData();
		uidata.setName("Bharath");
		
		places.forEach(
				(place) -> {
					if(uidata.getName().equals("Bharath")) {
						System.out.println(place);
					}
				}
				);
		
	}
}
