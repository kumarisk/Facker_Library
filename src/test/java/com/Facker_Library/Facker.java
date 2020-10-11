package com.Facker_Library;

import com.github.javafaker.Address;
import com.github.javafaker.Country;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class Facker {

	public static void main(String[] args) {
		
/*
 		Facker library is used for getting random test data each time. 
 */
		
		Faker fc = new Faker();
		
		
		String city= fc.address().city();
		String firstname = fc.address().firstName();
		String lastname = fc.address().lastName();
		
		System.out.println(city);
		System.out.println(firstname);
		System.out.println(lastname);
		
		System.out.println(fc.country().currency());

	}

}
