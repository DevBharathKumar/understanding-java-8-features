package com.bharath.optional.realTimeCaseCheck;

import java.util.Optional;

public class CustomerOnBoardReportManagerImpl 
{
	public static void main(String[] args) 
	{
		CustomerManagerImpl customerManager = new CustomerManagerImpl();
		
		CustomerOnBoardReport report = new CustomerOnBoardReport();
		
		System.out.println("Begining - "+report.getCustomerName());
		
		Customer customer = customerManager.getCustomerData(2);
		System.out.println("Printing object - "+customer);
		
		Optional<String> custName = Optional.ofNullable(customer)
				.filter(cus -> cus.getName() != null)
				.map(Customer::getName);
		
		custName.ifPresent(report::setCustomerName);
		
		System.out.println("End - "+report.getCustomerName());
		
	}
}
