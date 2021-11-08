package com.qa.calculatorexample;

public class FlowChart4 {
	public static void main(String[] args) {
//		flow4();
//		callMeTenTimes();
		printMeOneToTenTimes();
	}

	public static void flow4() {
		int A = 100;

		for (A = A; A <= 200; A++) {
			for (A = A; A % 2 == 0; A++) {
				System.out.println("*");
			}
			System.out.println("-");
		}
		System.out.println("END");
	}

	public static void callMeTenTimes() {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.println(j);
			}

		}
	}

	public static void printMeOneToTenTimes() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
	}

}