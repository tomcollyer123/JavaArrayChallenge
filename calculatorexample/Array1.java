package com.qa.calculatorexample;

public class Array1 {
	public static void main(String[] args) {

		int[] age = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int a : age) {
		enhancedLoop(a);	
			}
		}
		

		
	






// Boolean method

		public static void enhancedLoop(int i) {
		if(i%2==0) {
		System.out.println(true + "+" + i*i*i);
		}else {
		System.out.println(false + "+" + i*i);
		}
		}

//		enhancedLoop(3);
	}

//		int[] ageArray = {5,6,7,8,9,11,12,13,14,15};
//		
//		for (int i=0; i < ageArray.length; i++) {
//			ageArray[i] = ageArray[i]*10;
//			System.out.println(ageArray[i]);

//				String[] nameArray = {"John", "Sam", "Mike", "Tom", "James"};

//		for (String name : nameArray) {
//			System.out.println(name);

//		int[] ageArray2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; {
//		 for (int age2: ageArray2) {
//			 System.out.println(age2*age2);
//			 
//		 	}


//
//		}

	

