package Assignment2;
//sum of digit in any number
import java.util.Scanner;
public class SumofDigit {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=num; num>0; num=num/10)
		{
			int digit=num%10;
			sum=sum+digit;
			
		}
		System.out.println("The sum of digit of given number is="+sum);

	}

}
