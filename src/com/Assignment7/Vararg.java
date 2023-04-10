package com.Assignment7;
//Use of variable argument
public class Vararg
{
	public void sumNumber(int...args)
	{
		System.out.println("Argument length is:"+args.length);
		int sum=0;
		for(int x:args)
		{
			sum=sum+x;
		}
		System.out.println("Sum is="+sum);
	}
	

	public static void main(String[] args) 
	{
		Vararg v=new Vararg();
		v.sumNumber(6,8);
		v.sumNumber(8,4,6);
		
		
	

	}

}
