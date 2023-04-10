package com.Assignment9;
//Q3.
import java.util.Scanner;

public class CheckElements 
{
	public static void checkElement(String s)
	{
		int length=s.length();
		char ch[]=s.toCharArray();
		int vowel=0;
		int digit=0;
		int space=0;
		int conso=0;
	
		for(int i=0;i<length;i++)
		{
			if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')||(ch[i]=='A')||(ch[i]=='E')||(ch[i]=='I')||(ch[i]=='O')||(ch[i]=='U'))
			{
				vowel++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				digit++;
			}
			else if(ch[i]==' ')
			{
				space++;
			}
			else
			{
				conso++;
			}
		}
		System.out.println("Voewls are: "+vowel);
		System.out.println("digits are: "+digit);
		System.out.println("Spaces are: "+space);
		System.out.println("Consonants are: "+conso);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		CheckElements.checkElement(s);
		
	}

}
