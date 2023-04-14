package com.bharath.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression 
{
	public static void main(String[] args) 
	{
		System.out.println("***************** Inside main method *****************");
		
		//Example 1
		HelloWorld hello = () -> System.out.println("Hello World");
		
		hello.print();
		
		//Example 2
		Addition addition = (int a, int b) -> {
			int c;
			c = a + b;
			return c;
		};
		
		System.out.println("The added value is "+addition.add(10, 20));
		
		//Example 3
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Bharath", 28, "Male"));
		persons.add(new Person("Bharath", 27, "Male"));
		persons.add(new Person("Rakesh", 27, "Male"));
		persons.add(new Person("Abdul", 27, "Male"));
		persons.add(new Person("Bala", 28, "Male"));
		persons.add(new Person("Vinothini", 28, "Female"));
		persons.add(new Person("Reethi", 28, "Female"));
		persons.add(new Person("Abi", 28, "Female"));
		persons.add(new Person("Surya", 27, "Male"));
		persons.add(new Person("Surya", 28, "Male"));
		persons.add(new Person("Surya", 28, "Female"));
		
		persons.sort(Comparator.comparing(Person::getName));
		
		System.out.println("Name compare "+persons);
		
		persons.sort(Comparator.comparing(Person::getName)
				.thenComparing(Person::getSex));
		
		System.out.println("Name and sex "+persons);
		
		persons.sort(Comparator.comparing(Person::getSex).thenComparing(Person::getName));
		
		System.out.println("Sex and name "+persons);
		
		persons.sort(Comparator.comparing(Person::getName)
				.thenComparing(Person::getSex).thenComparing(Person::getAge));
		
		persons.forEach(
				person -> {
					System.out.println(person);
				}
		);
	}
}
