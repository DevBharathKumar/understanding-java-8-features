package com.bharath.optional.realTimeCaseCheck;

import java.util.Optional;

public class CustomerOnBoardReportManagerImpl 
{
	public static void main(String[] args) 
	{
		CustomerManagerImpl customerManager = new CustomerManagerImpl();
		
		CustomerOnBoardReport report = new CustomerOnBoardReport();
		Customer customer = customerManager.getCustomerData(null);
		
//		System.out.println("Begining - "+report.getCustomerName());
//				
//		System.out.println("Printing object - "+customer);
//		
//		//There is an unwanted checking of name in the code
//		Optional<String> custName = Optional.ofNullable(customer)
//				.filter(cus -> cus.getName() != null)
//				.map(Customer::getName);
//		
//		custName.ifPresent(report::setCustomerName);
//		
//		System.out.println("End - "+report.getCustomerName());
		
		System.out.println("----------- Even more optimized solution -------------");
		
		System.out.println("Before : "+report.getCustomerAge());
		
		System.out.println("Printing object - "+customer);
		
		Optional<Double> custAge = Optional.ofNullable(customer)
				.map(Customer::getAge);
		
		custAge.ifPresent(report::setCustomerAge);
		
		System.out.println("After : "+report.getCustomerAge());
		
	}
}
