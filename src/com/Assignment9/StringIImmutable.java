package com.Assignment9;
//Q2.
public class StringIImmutable {

	public static void main(String[] args) {
		/*String s1=new String("Java");
		System.out.println(s1);
		String s2=s1.concat(" J2ee");
		System.out.println(s1);
		System.out.println(s2);*/
		
		String s1="Java";
		String s2="Java";
		System.out.println(s1==s2);
		s1=s1+"J2ee";
		System.out.println(s1==s2);
		
		
		
	}

}
