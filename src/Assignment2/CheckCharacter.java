package Assignment2;
//check character whether it is vowel or consonant
import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		if((ch=='a'||ch=='A')||( ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o')||(ch=='O'))
		   {
			   System.out.println("vowel");
		   }
		   else
		   {
			   System.out.println("consonent");
		   }
		
		//if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
		  // {
			//   System.out.println("vowel");
		   //}
		   //else
		   //{
			 //  System.out.println("consonent");
		   //}

		
  
	}

}
