package com.AssignmentOnOops;
//Anonymous object which has no reference.used at the time of object creation only


public class Calculation
{
	public void fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is="+fact);
	}
	 
	public static void main(String[] args) 
	{
		new Calculation().fact(5);
		

	}

}
