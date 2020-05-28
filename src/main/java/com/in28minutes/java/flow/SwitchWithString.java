package com.in28minutes.java.flow;

public class SwitchWithString {

	
	//Yes in Java 7 we can use String in Switch. but We can achieve it using Enum.

	private enum Fruit {
		apple, carrot, mango, orange;
		}

		
	
	public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
		String typeOfDay;
		switch (dayOfWeekArg) {
		case "Monday":
			typeOfDay = "Start of work week";
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			typeOfDay = "Midweek";
			break;
		case "Friday":
			typeOfDay = "End of work week";
			break;
		case "Saturday":
		case "Sunday":
			typeOfDay = "Weekend";
			break;
		default:
			throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
		}
		return typeOfDay;
	}

	public static void main(String[] args) {

		SwitchWithString switchWithString = new SwitchWithString();
		System.out.println(switchWithString.getTypeOfDayWithSwitchStatement("Monday"));
		Fruit fruit = Fruit.valueOf("apple");
		System.out.println(fruit);
	}

}
