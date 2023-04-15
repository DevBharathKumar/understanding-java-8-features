package com.bharath.methodReference;

import java.util.function.BiFunction;

import com.bharath.lambda.Addition;
import com.bharath.lambda.HelloWorld;

public class MethodReference {

	public static void print() {
		System.out.println("Hello World");
	}
	
	public static void tryMe() {
		System.out.println("Hello World - Method return type and parameters only matter. Method name does not matter ");
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
		
	public static void main(String [] args)
	{
		System.out.println("----------------- STATIC EXAMPLES -----------------");
		
		HelloWorld hello1 = MethodReference::print;
		hello1.print();
		
		//We can use this approach also. 
		//Method return type and parameters only matter. Method name does not matter
		HelloWorld hello2 = MethodReference::tryMe;
		hello2.print();
		
		Addition addition = MethodReference::add;
		System.out.println("Added value is = "+addition.add(10, 20));
		
		BiFunction<Integer, Integer, Integer> biFunction = MethodReference::add;
		System.out.println("BiFunction Added value is = "+biFunction.apply(10, 20));
		
		BiFunction<Double,Double,Double> overRiding = MethodReference::add;
		System.out.println("Overrided BiFunction Added value is = "+overRiding.apply(10.2, 20.5));

	}
	
}
