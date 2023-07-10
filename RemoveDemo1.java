package com.assignment;

import java.util.ArrayList;

public class RemoveDemo1
{ 
	public static void main(String[] args) 
	{
		ArrayList<String>names=new ArrayList<String>();
		names.add("jupiter 123");
		names.add("Actica 123");
		names.add("Shine 123");
		names.add(2,"Acess 123");
		names.remove(3);
		
		for(String name:names)
		{
			System.out.println(name);
		}
	}

}
	


