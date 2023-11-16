package com.yogibaba.problems;

import java.util.Arrays;

public class SecondLargestNumber {
	
	
public static void main(String[] args) {
	
	
	int a[] = new int[5];
	
	a[0]=50;
	a[1]=40;
	a[2]=30;
	a[3]=20;
	a[4]=10;
	
	
	Arrays.sort(a);
	
	for(int i =0 ; i<a.length;i++) 
	{
		
		System.out.print(a[i] + " ");
		
		
	}
	
	System.out.println("Second LARGEST NUMBER IS::"+ a[a.length-2]);
}
	
	

}
