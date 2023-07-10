package com.assignment;
  
class Parent
{
	public void message()
	{
		System.out.println("this is first subclass");
	}
	
}
 class Second extends Parent
 {
	 public void message()
		{
			System.out.println("this is second subclass");
		}
		
 }



public class AbstractDemo 
{
  public static void main(String[] args) 
  {
	Parent f1=new Parent() ;
	f1.message(); 
	f1= new Second();
	f1.message(); 
}
}


