package com.AccessModifier;

import com.Assignment3.StudentAccess;

public class AccessDemo extends StudentAccess  {

	public static void main(String[] args) 
	{
		StudentAccess sa=new StudentAccess();
		
		//System.out.println(sa.age);
		//here i am not able to access the default access variables and methods this is outside the package
		//even i am not able to access in sub class of student access class outside the package
		
		
		//here i am not able to access protected method and protected variables also
		//for accessing protectd we have to make this class as a child class
		
		AccessDemo ad=new AccessDemo();
		ad.doProtected();

	}

}
