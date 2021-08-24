package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int number=0;
		System.out.print("Enter the number: ");  
		number=sc.nextInt();  
		int sumOfFactors=0;
		for(int factor=1;factor<=(number/2);factor++){
			if(number%factor==0)
				sumOfFactors+=factor;		
		}
		if(sumOfFactors==number)
			System.out.println("Perfect Number");
		else 
			System.out.println("Not a Perfect Number");
		sc.close();
	}
	
}