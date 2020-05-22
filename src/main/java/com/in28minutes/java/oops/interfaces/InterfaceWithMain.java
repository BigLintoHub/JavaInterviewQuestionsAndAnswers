package com.in28minutes.java.oops.interfaces;


public class InterfaceWithMain {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();// Bird is flying

		Aeroplane aeroplane = new Aeroplane();
		aeroplane.fly();// Aeroplane is flying
		
		

		// An interface reference variable can hold objects of any implementation of interface  
		Flyable flyable1 = new Bird();
		Flyable flyable2 = new Aeroplane();
		flyable1.fly();
		flyable2.fly();
		
		//Interface reference variable can be typecasted  with its implementation class
		Bird newBird = (Bird)flyable1;
		Aeroplane newAeroplane = (Aeroplane)flyable2;
		newBird.fly();
		newAeroplane.fly();
		
		//Interface reference variable can be typecasted  with Object class.
		Object object1= new Object();
		Object object2 = new Object();
		
		Flyable obj1 = (Flyable)object1;
		Flyable obj2 = (Flyable)object2;
		
		obj1.fly();
		
	}
}
