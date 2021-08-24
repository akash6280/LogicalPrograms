package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to start");
		int start = sc.nextInt();
		double startTime = System.currentTimeMillis();
		
		System.out.println("Enter 0 to stop");
		int stop = sc.nextInt();
		double stopTime = System.currentTimeMillis();
		
		double elapsedTime = (stopTime - startTime) / 1000;
		System.out.println("Elapsed time is " + elapsedTime);
		sc.close();
	}
}