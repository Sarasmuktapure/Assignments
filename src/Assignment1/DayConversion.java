package Assignment1;
import java.util.Scanner;
public class DayConversion {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of days");
		int d=sc.nextInt();
		
		int y=d/365;
		System.out.println("Year="+y);
		
		int w=d/7;
		System.out.println("Week="+w);
		
		int m=d%7;
		System.out.println("Days="+m);
		

	}

}
