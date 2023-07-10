package com.assignment;

import java.util.Scanner;

public class PrimeNumber
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	int n,sum=0,i=1,j;
	n=sc.nextInt();
	int t=n;
	while(n!=0)
	{
		int count=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			sum=sum+i;
			n--;
		}
		i++;
	}
	System.out.println("sum of first"+t+" prime number is"+sum);
}
}
