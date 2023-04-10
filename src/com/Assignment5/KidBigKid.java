package com.Assignment5;
//Q8. and Q9.
import java.util.Scanner;

class Kid
{
	int day;
	int num;
	
	public void readBook()
	{
		
		System.out.println("Kids like to read cartoon books");
	}
	public void readBook(int day,int num)
	{
		System.out.println("Kids read "+num+" stories in "+day+" day");
	}
}
class BigKid extends Kid
{

	
	public void readBook(int day,int num)
	{
		
		System.out.println("BigKids read "+num+" stories in "+day+" day");
	}
	
}
class Teenager extends Kid
{
	public void readBook(int day,int num)
	{
		System.out.println("Teenager read "+num+" stories in "+day+" day");
	}
	
}
public class KidBigKid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of kids");
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the day");
		int day=sc.nextInt();
		
		System.out.println("Enter the details of Bigkids");
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the day");
		int d=sc.nextInt();
		
		System.out.println("Enter the details of Teenager");
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("Enter the day");
		int time=sc.nextInt();
		
		
		
		/*BigKid bk=new BigKid();
		bk.readBook(d, n);
		bk.readBook();*/
		
		Kid k=new Kid();
		k.readBook(day, num);
		
		
		BigKid k1=new BigKid();
		Teenager k2=new Teenager();
		k1.readBook(d, n);
		k2.readBook(time, number);
		
		
		
	
	
		
		
	
		
		

	}

}
