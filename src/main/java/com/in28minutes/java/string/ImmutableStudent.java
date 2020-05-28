package com.in28minutes.java.string;

//The below class is a very simple immutable class which doesn’t hold any mutable object and never expose its fields in 
//any way; these type of classes are normally used for caching purposes.

public final class ImmutableStudent 
{ 
 final String name; 
 final int regNo; 

 public ImmutableStudent(String name, int regNo) 
 { 
     this.name = name; 
     this.regNo = regNo; 
 } 
 public String getName() 
 { 
     return name; 
 } 
 public int getRegNo() 
 { 
     return regNo; 
 } 
} 