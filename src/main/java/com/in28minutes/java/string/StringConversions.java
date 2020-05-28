package com.in28minutes.java.string;

public class StringConversions {

	public static void main(String[] args) {
		
// 3 ways to convert a String to Double
		String toBeDouble = "200.00";
		Double doubleStr = new Double(toBeDouble);
		System.out.println(doubleStr);

		Double doubleStr1 = Double.parseDouble(toBeDouble);
		System.out.println(doubleStr1);

		Double doubleStr2 = Double.valueOf(toBeDouble);
		System.out.println(doubleStr2);
		
		
		String toBeInt = "200.00";
		Integer intStr = new Integer(toBeInt);
		System.out.println(intStr);

		Integer intStr1 = Integer.parseInt(toBeInt);
		System.out.println(doubleStr1);

		Integer intStr2 = Integer.valueOf(toBeInt);
		
// 4 ways to convert a Double to String
		

	}

}
