package com.qa.calculatorexample;

public class Person {

//	Generate a few variables
	
	private String name;
	private int age;	
	private int height;
	private int shoesize;
	private String jobtitle;
	
//	Generate a constructor with all variables
	
	public Person(String name, int age, int height, int shoesize, String jobtitle) {

		this.name = name;
		this.age = age;
		this.height = height;
		this.shoesize = shoesize;
		this.jobtitle = jobtitle;
	}


	
//	Generate constructor with just name and height
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
//	Create 2 methods to call in runner class 
	
	public void greet() {
		System.out.println("Hello my name is " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("I am " + height + "cm tall");
		System.out.println("My shoe size is " + shoesize);
		System.out.println("I am a " + jobtitle);
			
	}
	
	public void greet2() {
		System.out.println("Hello my name is " + name);
		System.out.println("I am " + height + "cm tall");
	}
	
}
