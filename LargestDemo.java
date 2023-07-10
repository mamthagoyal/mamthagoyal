package com.assignment;

public class LargestDemo
{
  public static void main(String[] args) 
  {
	int temp,size;
	int a[]= {1,23,34,45,56,67,78};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("second largest number " +a[a.length-2]);
}
}
