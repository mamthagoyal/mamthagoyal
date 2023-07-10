
package com.assignment;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		ArrayList <Integer> arrayList =new ArrayList<>();
		ArrayList a1=new ArrayList();
		System.out.println("default size.."+a1.size());
		System.out.println("default value"+a1);
		a1.add(123);
		a1.add("arun");
		a1.add(new Integer(23));
		System.out.println("now size.."+a1.size());
		System.out.println("now value"+a1);
		
		a1.forEach(System.out::println);
		
		
		
	}

}

