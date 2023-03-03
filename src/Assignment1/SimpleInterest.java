package Assignment1;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principal amount");
		double p=sc.nextDouble();
		
		System.out.println("Enter the rate of interest");
		double r=sc.nextDouble();
		
		System.out.println("Enter the duration");
		double t=sc.nextDouble();
		
		double si=(p*r*t)/100;
		System.out.println("Simple interest is="+si);
		
		
		

	}

}
