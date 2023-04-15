package com.bharath.methodReference;

import java.util.function.BiFunction;

import com.bharath.lambda.HelloWorld;

public class MethodReferenceNonStatic {
	
	public void print() {
		System.out.println("Hello World - Non static");
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("----------------- NON STATIC EXAMPLES -----------------");
		
		MethodReferenceNonStatic nonStatic = new MethodReferenceNonStatic();
		
		HelloWorld hello = nonStatic::print;
		hello.print();
		
		//Anonymous class example
		HelloWorld hello1 = new MethodReferenceNonStatic()::print;
		hello1.print();
		
		BiFunction<Integer, Integer, Integer> biFunction = nonStatic::add;
		System.out.println("BiFunction added value is = "+biFunction.apply(10, 20));
	}

}
