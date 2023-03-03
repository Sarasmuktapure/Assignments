package Assignment1;
import java.util.Scanner;
public class ArithmaticOperation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("Addition is="+(a+b));
		System.out.println("Subtraction is="+(a-b));
		System.out.println("Multiplication is="+(a*b));
		System.out.println("Division is="+(a/b));
		System.out.println("Modulus is="+(a%b));
 
	}

}
