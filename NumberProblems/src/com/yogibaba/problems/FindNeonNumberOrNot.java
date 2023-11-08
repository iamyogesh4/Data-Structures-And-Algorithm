package com.yogibaba.problems;

import java.util.Scanner;

public class FindNeonNumberOrNot {
	
	public static boolean findNeon(int number) 
	{
		
		int temp = number;
		
		int squarenum = temp * temp;
		
		int sum =0;
		
		
		while(squarenum>0) 
		{
			
			int reminder = squarenum%10;
			
			sum= sum+reminder;
			
			
		   squarenum = squarenum/10;
			
			
		}
		
		if(sum==temp) 
		{
			return true;
		}
		
		
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Enter a Number::");
		
		int number = scn.nextInt();
		
		boolean result = findNeon(number);
		
		if(result==true) 
		{
			System.out.println("Its a Neon Number::");
		}
		
		else 
		{
			System.out.println("It is not a Neon Number::");
		}
	}
	 

}
