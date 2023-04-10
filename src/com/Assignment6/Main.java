package com.Assignment6;
//Q1.
class Base
{
	//public final void show()
	public void show()
	{
		System.out.println("Base::show() called");
	}
}
class Derived extends Base
{
	public void show()
	{
		System.out.println("Derived::show() called");
	}
}



public class Main {

	public static void main(String[] args) {
	Base b=new Derived();
	b.show();

	}

}

//here final method can not be ovveridden so remove final from base method
