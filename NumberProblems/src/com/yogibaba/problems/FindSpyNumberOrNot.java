package com.yogibaba.problems;

import java.util.Scanner;

public class FindSpyNumberOrNot {
	
	
	
	public static boolean findSpy(int number) 
	{
		
		int temp = number;
		
		int sum =0 ;
		
		int mul= 1;
		
		while(temp>0) 
		{
			
			int reminder = temp% 10;
			
			sum = sum + reminder;
			
			mul = mul *reminder;
			
			temp = temp/10;
			
		}
		
		if(sum==mul) 
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
		
		System.out.println("Enter a number::");
		
		int number = scn.nextInt();
		
		boolean result = findSpy(number);
		
		if(result==true) 
		{
			System.out.println("It is Spy Number::");
		}
		else 
		{
			System.out.println("It is not spy number::");
			
		}
		
		
	}

}
