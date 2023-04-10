package com.Assignment3;

public class Account 
{
	int acc_no;
	String name;
	float balance;
	
	public void insert(int a,String n,float amt)
	{
		acc_no=a;
		name=n;
		balance=amt;
	}
	public void deposit(float amt)
	{
		balance=balance+amt;
		System.out.println(amt+" Rs. Credited");
	}
	public void withdraw(float amt)
	{
		if(balance<amt)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			balance=balance-amt;
			System.out.println(amt+" Rs. Debited");
		}
		
	
	}
	public void checkBalance()
	{
		System.out.println("Available balance="+balance+" Rs.");
	}
	public void display()
	{
		System.out.println("Account number is:"+acc_no);
		System.out.println("Account name is:"+name);
		System.out.println("Account's available balance is:"+balance+" Rs.");
		
	}

	public static void main(String[] args) 
	{
		Account ac=new Account();
		ac.insert(937010, "Aditya", 50000);
		ac.display();
		ac.deposit(10000);
		ac.checkBalance();
		ac.withdraw(5000);
		ac.checkBalance();
		

	}

}
