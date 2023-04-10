package com.Assignment3;

 public class StudentAccess
{
	private int roll_no=2;
	public int ad_no=3456;
	int age=18;
	protected String course_id="Java5";
	
	public void doPublic()
	{
		System.out.println(this.ad_no);
	}
	void doDefault()
	{
		System.out.println(this.age);
	}
	private void doPrivate()
	{
		System.out.println(this.roll_no);
	}
	protected void doProtected()
	{
		System.out.println(this.course_id);
	}
   public static void main(String[] args) 
	{
		StudentAccess sa=new StudentAccess();
		sa.doPublic();
		sa.doDefault();
		sa.doProtected();
		sa.doPrivate();
		
		//within same class we are able to access all the variables 
		
		//private-accessibility within the same class only
		
		//default-only within the package
		
		//protected-within the package and outside the package through child class
		
		//public-within the class outside the class, within the package outside the package
	

	}

}
