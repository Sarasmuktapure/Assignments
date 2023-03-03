package Assignment2;
//perform arithmetic operation 
import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1=sc.nextInt();
		
		System.out.println("Enter the num2");
		int num2=sc.nextInt();
		
		System.out.println("Enter the operation from following menu:");
		System.out.println(" 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide\n ");
		int num=sc.nextInt();
		
		switch(num)
		{
		case 1:System.out.println("Addition is="+(num1+num2));
		break;
		
		case 2:System.out.println("Substraction is="+(num1-num2));
		break;
		
		case 3:System.out.println("Multiplication is="+(num1*num2));
		break;
		
		case 4:System.out.println("Division is="+(num1/num2));
		break;
		
		default:System.out.println("Invalid input");
		
		}



	}

}
