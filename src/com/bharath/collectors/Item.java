package com.bharath.collectors;

public class Item 
{
	private int id;
	private String name;
	private Double price;
	private String meals;
	
	public Item(int id, String name, Double price,String meals)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.meals = meals;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", meals=" + meals + "]";
	}
	
}
