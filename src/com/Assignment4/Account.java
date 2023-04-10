package com.Assignment4;

import java.util.Scanner;

public class Account 
{
	String customerName;
	long accountNo;
	Account()
	{
		System.out.println("I am in default constructor");
		customerName="Aditya";
		accountNo=5364748;
	}
	
	Account(String custName,long accNo)
	{
		System.out.println("I am in parameterized constructor");
		customerName=custName;
		accountNo=accNo;
	}

	public static void main(String[] args) 
	{
		/*Account ac=new Account();
		System.out.println(ac.accountNo);
		System.out.println(ac.customerName);
		//here we are not assigned values to instance variables so we get 0 and null by default
		//default constructor is provided by java to facilitate the creation of a new object, here variables are assigned default values
        
		Account ac1=new Account();
		System.out.println(ac1.accountNo);
		System.out.println(ac1.customerName);
		//here we have getting the values bcoz we have define the default constructor and whenever object is 
		//created by new keyword default constructor is called by jvm and here we have define already so jvm dose not provide another one
	
	    Account ac2=new Account("Aditya", 735474);
	    System.out.println(ac2.customerName);
	    System.out.println(ac2.accountNo);*/
	    
	    
	    
	    Account ac3=new Account("Divya",7654876);
	    System.out.println(ac3.accountNo);
	    System.out.println(ac3.customerName);
	    
	    Account ac4=new Account("Rani",35467576);
	    System.out.println(ac4.customerName);
	    System.out.println(ac4.accountNo);
	
	
	
	
	
	
	
	}

}
