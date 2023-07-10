package com.assignment;

public class Pattern4Demo
{
 public static void main(String[] args)
 {
	int number =3;
	int m,n;
	for(m=1;m<=number;m++)
	{
		for(n=1;n<=number-m;n++)
		{
			System.out.print("");
			
		}
		for(n=1;n<=m*2-1;n++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
