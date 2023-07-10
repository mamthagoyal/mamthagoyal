package com.assignment;


import java.util.Scanner;

class NoAtmBalanceException  extends Exception
	{
		double amount;
		public NoAtmBalanceException(double amount)
		{
			this.amount=amount;
			
		}
	}
	class ATM
	{
		double balance;
		public void deposit(double amount)
		{
			balance+=amount;//balance=balance+amount
			System.out.println(amount+"rs deposited...");
		}
		public void withdrawal(double amount)throws NoAtmBalanceException
		{
			if(amount<=balance)
			{
				balance-=amount;
				System.out.println(amount+"rs withdrawal successfully...");
				
			}
			else
			{
				double needs=amount-balance;
				throw new NoAtmBalanceException(needs);
			}
		}
	}
	public class BankDemo 
	{
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter amount for deposit ");
				double amount=sc.nextDouble();
				
				ATM a1=new ATM();
				a1.deposit(amount);
				System.out.println("enter amount for withdrawal...");
				amount=sc.nextDouble();
				try
				{
					a1.withdrawal(amount);
				}catch (NoAtmBalanceException e) 
				{
					System.out.println("if you enter"+e.amount+"rs more into your account than your withdraw");
				}
				
			}
	}









