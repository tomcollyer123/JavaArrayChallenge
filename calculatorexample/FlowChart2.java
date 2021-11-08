package com.qa.calculatorexample;

public class FlowChart2 {
	public static void main(String[] args) {
		function(500);
	}




	public static void function(int A) {
	
		if (A>2000) {
			System.out.println("A");
			if (A>6000) {
				System.out.println("C");
				System.out.println("END");
			} else {
				System.out.println("B");
			    if (A>4000) {
			    	System.out.println("D");
			    	System.out.println("END");
			    } else 	{
			    	System.out.println("E");
			    	System.out.println("END");
			    }
			  
			}
			
	} 	 else {
			System.out.println(1); {
			if (A>100) {
				System.out.println(3);
			if (A>600) {
				System.out.println(5);
				System.out.println("END");
			} else { 
				System.out.println(4);
				if (A>500) {
					System.out.println(6);
					System.out.println("END");	
				} else { 
					System.out.println(7);
					System.out.println("END");
				}
			}
			} else { 
				System.out.println(2);
				System.out.println("END");
			}
			}
			}
		}
	}