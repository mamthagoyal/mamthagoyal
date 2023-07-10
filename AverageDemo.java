package com.assignment;

import java.util.Scanner;

public class AverageDemo 
{
	public static void main(String[] args)
	{
		int a[]=new int[]{25,45,12,13,34};
		int sum=0;
		double avg;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/a.length;
			System.out.println("average of array.."+avg);
		}
		
	
}}