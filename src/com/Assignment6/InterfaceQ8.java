package com.Assignment6;
//Q8.

interface IceCream
{
	void eat();
}
interface Juice
{
	void drink();
}
class Mastani implements IceCream,Juice
{

	@Override
	public void drink() 
	{
		System.out.println("This is juice of apple");
	}

	@Override
	public void eat()
	{
		System.out.println("this is yummy icecream");
		
	}
	
}
public class InterfaceQ8 {

	public static void main(String[] args) 
	{
		Mastani m=new Mastani();
		m.eat();
		m.drink();
		
		System.out.println("------------------------------");
		IceCream i=new Mastani();
		Juice j=new Mastani();
		i.eat();
		j.drink();
		
		
		

	}

}
