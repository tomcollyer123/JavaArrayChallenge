package com.qa.calculatorexample;

import java.util.LinkedList;
import java.util.List;

public class ExtraJavaExercises {
 public static void main(String[] args) {
 
	 
	 public static List<Integer> primeNumbers(int n) {
		    List<Integer> primeNumbers = new LinkedList<>();
		    for (int i = 2; i <= n; i++) {
		        if (isPrime(i)) {
		            primeNumbers.add(i);
		        }
		    }
		    return primeNumbers;
		}
		public static boolean isPrime(int number) {
		    for (int i = 2; i < number; i++) {
		        if (number % i == 0) {
		            return false;
		        }
		    }
		    return true;
				
}
}
