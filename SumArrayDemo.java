package com.assignment;

import java.util.Scanner;

public class SumArrayDemo 

	{
		public static void main(String[] args)
		{
			int a[][]=new int[3][3];//2d array matrix format
			int b[][]=new int[3][3];
			int c[][]=new int[3][3];
			
			Scanner sc=new Scanner(System.in);
			System.out.println("now start A array...");
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println("enter A value...");
					a[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			System.out.println("enter B value...");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println("enter B value...");
					b[i][j]=sc.nextInt();
				}
				System.out.println();
			}
				System.out.println("now summation");
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
					
						c[i][j]=a[i][j]+b[i][j];
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				
				}}
		}



