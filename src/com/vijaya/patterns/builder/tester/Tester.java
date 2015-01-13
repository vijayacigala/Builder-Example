package com.vijaya.patterns.builder.tester;


import com.vijaya.patterns.builder.Vehicle;

public class Tester {

	public static void main(String[] args) {
		
		
		Vehicle bike	=	new Vehicle.Builder().setBody("Fibre matte body!").build();
		
		System.out.println("Bike body :: "+ bike.getBody());
		System.out.println("Bike body :: "+ bike.getBody());
		System.out.println("Bike body :: "+ bike.getBody());
		
	}
}
