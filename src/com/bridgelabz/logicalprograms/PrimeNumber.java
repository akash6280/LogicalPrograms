package com.bridgelabz.logicalprograms;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int number=0;
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number: ");  
		number=sc.nextInt();
		
		boolean flag=true;
		for(int factor=2;factor<number;factor++) {
			if(number%factor==0)
				{
					flag=false;
					break;
				}
		}
		if(flag)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
		sc.close();
		
	}
}