package com.assignment;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateDemo
{
  public static void main(String[] args)
  {
	ArrayList<Integer>numbers=new ArrayList();
	numbers.add(1);
	numbers.add(7);
	numbers.add(2);
	System.out.println("\nArrayList"+numbers);
	ListIterator<Integer>iterate=numbers.listIterator();
	System.out.println("\niterating over ArrayList");
	while(iterate.hasNext())
	{
		System.out.print(iterate.next()+" , ");
	}
	
}
}
