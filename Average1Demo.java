package com.assignment;

public class Average1Demo 
{
 public static void main(String[] args) 
 {
	int sum=0;
	int[]arr= {1,2,3,4,5,6,7,8,9,10};
	float avg;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
		
	}
	System.out.println("sum is.."+sum);
	avg=(float)(sum/10);
	System.out.println("average of array element.."+avg);
}
}
