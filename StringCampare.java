package com.assignment;

public class StringCampare
{
  public static void main(String[] args)
  {
	String str1="ARUN MALI";
	String str2="ARUN1 MALI";
	System.out.println(str1.compareTo(str2));
	while(str1.equals(str2))
	{
		System.out.println("both the string are same");
	}
	System.out.println("string is not same");
}
}
