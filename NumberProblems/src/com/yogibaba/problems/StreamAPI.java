package com.yogibaba.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		
		List<Object> list = new ArrayList<>();


		for(int i =0 ; i<=100;i++)
		{
		   list.add(i);
		}



		System.out.println(list);
	}

}
