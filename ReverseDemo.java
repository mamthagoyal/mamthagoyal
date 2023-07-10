package com.assignment;

public class ReverseDemo
{
  public static void main(String[] args) 
  {
	int a[]=new int[] {1,2,23,34,4};
	System.out.println("original array");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	System.out.println();
   System.out.println("reverse array");
  for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]+" ");
	}
	System.out.println();
}
}
