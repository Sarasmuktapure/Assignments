package com.Assignment6;
//Q4. and Q5.

class Demo{
      final int x=10;
      
      public final void display()
  	{
  		System.out.println("Welcome to demo class");
  	}
}


class DemoChild extends Demo{
	/* public final void display()
	  	{
	  		System.out.println("Welcome to demo class");
	  	}*/
	
}

public class FinalDemo {

	public static void main(String[] args)
	{
		DemoChild d=new DemoChild();
		System.out.println(d.x);
		d.display();
		
	

	}

}

//a. we can not change the value of final variable
//b. final method of parent class can not be ovveridden in child class
//c. we can not extend the final class
//d. final method of parent class can be inherited in child class
