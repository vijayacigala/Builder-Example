package com.vijaya.patterns.builder.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.vijaya.patterns.builder.Vehicle;

public class Tester {

	public static void main(String[] args) {
		
		
		Vehicle bike	=	new Vehicle.Builder().setBody("Fibre matte body!").build();
		
		
		System.out.println("Bike body :: "+ bike.getBody());
		
	}
}
