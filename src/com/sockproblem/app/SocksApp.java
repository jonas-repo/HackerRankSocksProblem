package com.sockproblem.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SocksApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
		//hacker rank input
		int[] ar = {10,20,20,10,10,30,50,10,20};
		
		//object initialization
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		
		//counters declaration
		int count=0;
		int sum=0;
		
		//process to fill the hash map by repeated values
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
		
		//process to get the pairs per values
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
		
		System.out.println("Numbers repeated: "+hash.toString());
		System.out.println("Pairs posibles:"+sum/2);
		
	}

}
