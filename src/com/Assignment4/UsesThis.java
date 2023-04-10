package com.Assignment4;

public class UsesThis
{
	int a;
	int b;
	
	 UsesThis()
	{
		this(20,10);
		System.out.println("Inside Default constructor");
	}
	
	 UsesThis(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Inside parameterized constructor");
		this.show();
	}
	
	
	 void display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
	 
	 void show()
	 {
		 this.display();
		 int sum=a+b;
		 System.out.println("Addition is="+sum);
	 }
	
		
       public static void main(String[] args)
	{
		UsesThis ut=new UsesThis();
		
		
		
		//t.display();
	
	}
	
	

}
