package com.sockproblem.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SocksApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10,20,20,10,10,30,50,10,20};
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		
		int count=0;
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) 
			{
				if(ar[j] == ar[i])
				{ 
					count++;
					hash.put(ar[i],count);
				}
			}
			count=0;
		}
		
		for(Map.Entry<Integer,Integer> map : hash.entrySet())
		{
			if(map.getValue() > 1)
			{
				if(map.getValue() % 2 == 0)
				{
					sum = sum + map.getValue();
				}
				else
				{
					sum = sum + (map.getValue()-1);
				}
			}
		}
		
		System.out.println(hash.toString());
		System.out.println(sum/2);
		
	}

}
