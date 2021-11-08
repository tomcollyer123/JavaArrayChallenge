package com.qa.calculatorexample;

public class Calculator {

	public static void main(String[] args) {
		// System.out.println(add(2, 3));
		// System.out.println(multiplication(3, 4));
		// System.out.println(sub(10, 7));
		System.out.println(division(10,20));
		// Can force a double to be a float using the key term float but you lose precision as it will round the number to the nearest point.
		float f=(float)3.14919273564566;
		System.out.println(f);
	}

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int multiplication(int num3, int num4) {
		int result = num3 * num4;
		return result;
	}

	public static int sub(int num5, int num6) {
		int result = num5 - num6;
		return result;
	}

	public static double division(double num7, double num8) {

		if (num8 < num7) {
			return num7 / num8;
		} else {
			System.out.println("Division cannot be performed");
			return 0;
		}
	}
}













