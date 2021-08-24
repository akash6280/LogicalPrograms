package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int number=0;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter number to be reversed");
		number=sc.nextInt();
		
		int remainder=0,reverseNumber=0;
		while(number>0) {
			remainder=number%10;
			reverseNumber=reverseNumber*10+remainder;
			number=number/10;
		}
		
		System.out.println("Reversed number is :"+reverseNumber);
		sc.close();
	}
}