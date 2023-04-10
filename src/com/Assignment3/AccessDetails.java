package com.Assignment3;

public class AccessDetails  {

	public static void main(String[] args)
	{
		StudentAccess sa=new StudentAccess();
		//System.out.println(sa.roll_no);
		//here i am not able to access private variable roll_no outside the class 
		sa.doPublic();
		//here i am able to access public,default,protected access variables outside the class but within same package 
		//but i am not able to access private variables and methods 
		
	

	}

}
