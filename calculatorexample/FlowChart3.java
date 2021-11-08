package com.qa.calculatorexample;

public class FlowChart3 {
	public static void main(String[] args) {
		flow2(50);
	}

	public static void flow2(int A) {

        int numbercount = 100;
        boolean higherThan200 = false;

        while(higherThan200) {
            System.out.println("A");
            numbercount++;

            if(numbercount > 200) {
                higherThan200 = true;
            }
        }

        System.out.println("End");
		
	}
}
