package com.assignment;

import java.util.Scanner;

public class GradesDemo 
{
   public static void main(String[] args)
   {
	  float marks[]=new float[7];
	  float sum = 0,avg = 0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the marks obtained in 7 subjects");
	  for(int i=0;i<7;i++)
	  {
		  marks[i]=sc.nextFloat();
		  
	  } for(int i=0;i<7;i++)
	  {
		  sum=sum+marks[i];
		  avg=sum/7;
		  
	  }System.out.println("\n grade");
	  
	  if(avg>=90)
		  System.out.println("AA");
	  else if(avg>=80)
		  System.out.println("AB");
	  else if(avg>=70)
		  System.out.println("BB");

   else if(avg>=60)
		  System.out.println("BC");

else if(avg>=50)
	  System.out.println("CD");
else if(avg>=40)
	  System.out.println("DD");
else 
	  System.out.println("FAIL");
}
}

