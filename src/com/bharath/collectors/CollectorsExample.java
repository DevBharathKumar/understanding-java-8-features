package com.bharath.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample 
{

	public static void main(String[] args) 
	{
		List<Item> menu = new ArrayList<>();
		
		menu.add(new Item(1, "Dosa", 40.0, "Breakfast"));
		menu.add(new Item(2, "Paper roast", 60.0, "Breakfast"));
		menu.add(new Item(3, "Idly", 12.0, "Breakfast"));
		menu.add(new Item(4, "Vada", 12.0, "Breakfast"));
		
		List<Double> itemPrices = menu.stream()
				.map(Item::getPrice)
				.collect(Collectors.toList());
		
		System.out.println("Only prices - "+itemPrices);
		
		//Converting one collection to another collection
		
		Set<Double> uniqueItemPrice = menu.stream()
				.map(Item::getPrice)
				.collect(Collectors.toSet());
		
		System.out.println("Only unique prices - "+uniqueItemPrice);
		
		Long itemCount = menu.stream()
				.collect(Collectors.counting());
		
		System.out.println("Total no of items = "+itemCount);
		
		Double totalPrice = menu.stream()
				.collect(Collectors.summingDouble(Item::getPrice));
		
		System.out.println("Total price is = "+totalPrice);
		
		//Alternative way of writing Item::getPrice is "i -> i.getPrice()"
		Double averagePrice = menu.stream()
				.collect(Collectors.averagingDouble(i -> i.getPrice()));
		
		System.out.println("The average price is = "+averagePrice);
	}

}
