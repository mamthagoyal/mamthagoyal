package com.assignment;

import java.util.ArrayList;

public class RemoveDemo 
{
  public static void main(String[] args) 
  {
	  ArrayList <String> arrayList =new ArrayList<>();
		ArrayList a1=new ArrayList();
		System.out.println("default size..."+a1.size());
		System.out.println("default value.."+a1);
		a1.add(123);
		a1.add("arun");
		a1.add(new Integer(123));
		a1.add('j');
		System.out.println("default size..."+a1.size());
		System.out.println("default value.."+a1);
		a1.remove(123);
		a1.remove('j');
		System.out.println("default size..."+a1.size());
		System.out.println("default value.."+a1);
		a1.forEach(System.out::println);
		
}
}
