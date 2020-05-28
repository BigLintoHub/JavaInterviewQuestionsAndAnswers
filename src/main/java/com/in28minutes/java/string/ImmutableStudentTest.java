package com.in28minutes.java.string;

public class ImmutableStudentTest {

	public static void main(String[] args) {
		ImmutableStudent s = new ImmutableStudent("ABC", 101); 
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo()); 
        
        String str="linto";
        String str1="linto";
        System.out.println(str); 
        System.out.println(str1); 
        System.out.println(str == str1); 
         str="luckose";
         System.out.println(str); 
         System.out.println(str == str1); 
	}

}
