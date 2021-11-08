package com.qa.calculatorexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array2 {
public static void main(String[] args) {
	
	
	
	List <String> names = new ArrayList<>();
		
// Adding names
	names.add("tom");
		names.add("jen");
		names.add("tim");
		names.add("bob");
		names.add("sam");
		names.add("fred");
		names.add("james");
		
// Changing or swapping an element
//		names.set(1, "Jenny");
		
// Removing an element
//		names.remove(2);
		
//		Enhanced For-Loop
//		for (String name : names) {
//			System.out.println(name);
//		}
// Basic For-Loop		
		
//		for (int i=0; i< names.size();i++) {
//			System.out.println(names.get(i));
//		}
		
// Using get to select a specific element
//		System.out.println(names.get(0)); 
		
// Using sort to organise the elements	
//		Collections.sort (names);
//		System.out.println(names);
		
//	Using reverse, swap and clone to organise elements	
		
		Collections.swap(names, 0, 4);
		Collections.reverse(names);
			System.out.println(names);
		
		
}
}
