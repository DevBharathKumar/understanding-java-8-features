package com.bharath.optional.realTimeCaseCheck;

public class CustomerManagerImpl 
{
	
	public Customer getCustomerData(Integer custId)
	{
		Customer cus = null;
		
		if(custId == null) {
			return cus;
		}
		
		if (custId == 1) {
			cus = new Customer(null);
		} else if (custId == 2) {
			cus = new Customer("Bharath");
		}
		
		return cus;
	}

}
