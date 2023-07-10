package com.assignment;

public class CopyArrayDemo
{
 public static void main(String[] args) 
 {
	int a[]=new int[]{1,2,3};
	int b[]=new int[a.length] ;
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
		
	}
	System.out.println("elements of original array is");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
		
	}System.out.println();
	System.out.println("elements of new array");
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]+" ");
		
	}System.out.println();
	
		
	
	
	
	
	
	
}
}
