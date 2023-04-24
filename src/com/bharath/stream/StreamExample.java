package com.bharath.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bharath.collectors.Item;

public class StreamExample 
{

	public static void main(String[] args) 
	{
		List<Item> menu = new ArrayList<>();
		
		menu.add(new Item(1, "Dosa", 40.0, "Breakfast/Dinner"));
		menu.add(new Item(2, "Paper roast", 60.0, "Breakfast/Dinner"));
		menu.add(new Item(3, "Idly", 12.0, "Breakfast/Dinner"));
		menu.add(new Item(4, "Vada", 12.0, "Breakfast"));
		menu.add(new Item(5, "Pongal", 12.0, "Breakfast"));
		menu.add(new Item(6, "Parota", 15.0,"Dinner"));
		menu.add(new Item(7, "Briyani", 100.0,"Lunch"));
		menu.add(new Item(8, "Fried rice", 100.0,"Dinner"));
		menu.add(new Item(9, "Tea", 10.0, "Breakfast/Lunch/Dinner"));
		
		//Filtering the data
		List<Item> minimumMenu = menu.stream()
				.filter(i -> i.getPrice() <= 20)
				.collect(Collectors.toList());
		
		minimumMenu.forEach(System.out::println);
		
		System.out.println("Find total number of items = "+menu.stream().count());
		
		System.out.println("-------------------------");
		
		//Filtering the data and looping to perform some business operation
		String mealTimeOfTheDay = "Breakfast";
		List<String> availableDishes = new ArrayList<>();
		availableDishes.add("Dosa");
		availableDishes.add("Idly");
		availableDishes.add("Vada");
		availableDishes.add("Tea");
		
		menu.stream()
			.filter(i -> i.getMeals().contains(mealTimeOfTheDay) && availableDishes.contains(i.getName()))
			.forEach(System.out::println);
		
		Long totalItemsAvailable = menu.stream()
				.filter(i -> i.getMeals().contains(mealTimeOfTheDay) && availableDishes.contains(i.getName()))
				.count();
		
		System.out.println("totalItemsAvailable = "+totalItemsAvailable);
		
		System.out.println("-------------------------");
				
		Item minItem = menu.stream().min((item1, item2) -> item1.getPrice() > item2.getPrice() ? 1 : -1).get();
		System.out.println("minItem = "+minItem);
		
		Item maxItem = menu.stream().max((item1,item2) -> item1.getPrice() > item2.getPrice() ? 1 : -1).get();
		System.out.println("maxItem = "+maxItem);
		
		System.out.println("-------------------------");
		
		Double totalPrice1 = menu.stream()
				.collect(Collectors.summingDouble(Item::getPrice));
		
		System.out.println("First way of getting the price = "+totalPrice1);
		
		Double totalPrice2 = menu.stream()
				.map(Item::getPrice)
				.reduce(0.0,(sum,price)-> sum+price);
		
		System.out.println("Second way of getting the price = "+totalPrice2);
		
	}

}
