package com.assignment;

class First implements runnable

{
public void run()
{
	for(int i=0;i<=5;i++)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public void message() {
	// TODO Auto-generated method stub
	
}
}



public class AssignmentDemo 
{
  public static void main(String[] args)
{
	First s1=new First();
	Thread t1=new Thread();
	t1.start();
	for(int i=0;i<=5;i++)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread is"+i);
	}
}
	  
}

