package com.assignment;

class Multi extends Thread
{
public class MultiThread
{
 public static void main(String[] args)
{
	Multi t1=new Multi();
	t1.start();
	System.out.println("thread is running");
}
}
}