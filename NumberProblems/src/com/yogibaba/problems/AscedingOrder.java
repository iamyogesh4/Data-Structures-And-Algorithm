package com.yogibaba.problems;

import java.util.Scanner;

public class AscedingOrder {
	
	
	
	
	static void selsort(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min_pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min_pos])
					min_pos=j;
			}
			if(min_pos!=i)
			{
				int temp=a[min_pos];
				a[min_pos]=a[i];
				a[i]=temp;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		selsort(a,n);
		System.out.println("Sorted List is");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	

}


