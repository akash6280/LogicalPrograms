package com.bridgelabz.logicalprograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int fibonacciTerm=10;
		int previousNumber=0;
		int currentNumber=1;
		System.out.print(previousNumber+" "+currentNumber+" ");
		
		int nextNumber=0;
		for(int index=2;index<fibonacciTerm;index++) {
			
			nextNumber=previousNumber+currentNumber;
			System.out.print(nextNumber+" ");
			previousNumber=currentNumber;
			currentNumber=nextNumber;
		}
	}

}