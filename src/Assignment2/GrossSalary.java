package Assignment2;
//input basic salary and calculate gross salary
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary of an employee");
		int bs=sc.nextInt();
		
		float hra;
		float da;
		float gs;
		
		if(bs<=10000)
		{
			hra=bs*0.2f;
			da=bs*0.8f;
		}
		else if(bs<=20000)
		{
			hra=bs*0.25f;
			da=bs*0.90f;
		}
		else
		{
			hra=bs*0.30f;
			da=bs*0.95f;
		}
		
		gs=bs+hra+da;
		System.out.println("Gross salary of an employee is="+gs);
		

		

		

	}

}
