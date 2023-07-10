package com.assignment;

class  Demo  extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		try {
			Thread .sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("my thread is "+i);
		}
	}

	
}

public class ThreadClassDemo
{
  public static void main(String[] args) 
  {
	Demo f1=new Demo();
	f1.setName("arun");
	f1.setPriority(Thread.MAX_PRIORITY);
	System.out.println(f1);
    f1.start();//automatically called run()//runnable
	for(int i=0;i<=5;i++)
	{
	try {
		Thread .sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(+i);
	}

  }
}
