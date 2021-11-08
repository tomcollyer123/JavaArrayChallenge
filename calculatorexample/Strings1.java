package com.qa.calculatorexample;

public class Strings1 {
public static void main(String[] args) {
	
//	Creating Strings
	String mystr = " yesterday it was raining" ;
	String mystr2 = "today it is sunny,";
		
//	Combining the strings to make a sentence and also moving all strings to upper case		
	
//	System.out.println(mystr2.toUpperCase() + mystr.toUpperCase());
	
//	Using substring to print out a new sentence (today it is raining)
	System.out.println(mystr2.substring(0,11) + mystr.substring(17,25));
}
}
