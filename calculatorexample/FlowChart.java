package com.qa.calculatorexample;

public class FlowChart {
	public static void main(String[] args) {
		System.out.println(flow(10, 5, false));
		System.out.println(flow(100));

	}

	public static int flow(int num9, int num10, boolean boolie) {
		if (boolie) {
			return num9 + num10;
		} else {
			return num9 * num10;

		}
	}






}