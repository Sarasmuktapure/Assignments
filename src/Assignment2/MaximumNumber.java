package Assignment2;
//find maximum number from given 3 number
import java.util.Scanner;
public class MaximumNumber {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the third number");
		int num3=sc.nextInt();
		
		String result=((num1>num2) && (num1>num3))?"Maximum number is="+num1:((num2>num1) && (num2>num3))?"Maximum number is="+num2:"Maximum number is="+num3;
		
		System.out.println(result);
		

	}

}
