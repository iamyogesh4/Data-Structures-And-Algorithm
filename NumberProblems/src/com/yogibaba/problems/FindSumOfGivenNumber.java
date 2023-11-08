package com.yogibaba.problems;

import java.util.Scanner;

public class FindSumOfGivenNumber {
	
	
	
	public static int findSum(int number) 
	{
		int temp = number;
		int sum = 0 ;
		
		
		while(temp>0) 
		{
			
			int reminder= temp % 10;
			
			sum= sum + reminder;
			
			temp = temp/10;
		}
		
		return sum;
	}
	
	
	public static void main(String[]args) 
	{
		
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Number::");
		
		int number = scn.nextInt();
		
		int sum = findSum(number);
		
		System.out.println(sum);
		
		
		
	}

}
