package com.bharath.dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		System.out.println("Today date "+now);
		System.out.println("Yesterday date "+now.minusDays(1));
		System.out.println("Tomorrow date "+now.plusDays(1));
		System.out.println("Is this year leap year - "+now.isLeapYear());
		
		//Converting the LocalDate to String
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String nowInString = now.format(df);
		System.out.println("LocalDate to string - "+nowInString);
		
		//Creating LocalDate from parameters
		LocalDate customDate = LocalDate.of(1994, 9, 14);
		System.out.println("Bharath birthdate - "+customDate);
		
		//Creating LocalDate from String
		LocalDate dataFromUser = LocalDate.parse("04-12-2020",df);
		System.out.println("String to LocalDate - "+dataFromUser);
		
	}
}
