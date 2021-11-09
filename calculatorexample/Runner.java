package com.qa.calculatorexample;

public class Runner {
	public static void main(String[] args) {
		
	

	Person tom = new Person ("Tom",23,196,12,"software developer");
	Person ted = new Person ("Ted",31,174,7,"chemist");
	Person bill = new Person ("Bill",29,156,8,"footballer");
	Person bob = new Person ("Bob",14,180,9,"farmer");


	Person sue = new Person ("Sue", 165);
	Person jane = new Person ("Jane", 172);
	Person claire = new Person ("Claire", 158);
	
	
	//	Call the methods created
	
	tom.greet();
	ted.greet();
	bill.greet();
	bob.greet();
	
//	Method 2
	
	sue.greet2();
	jane.greet2();
	claire.greet2();
	
	}
	
}

