package com.assignment;

public class MultipleCatch
{
	public static void main(String[] args)
	{ 
		try {
			int a[]=new int[5];
			a[5]=30/0;
			
		} catch (ArithmeticException e) 
		{
			
		System.out.println("arithmetic exception occur");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexoutofBoundsException");
		}
		catch (Exception e) {
			System.out.println("parent exception occur");
		}
		
	}

}
