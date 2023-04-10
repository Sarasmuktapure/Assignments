package com.Assignment9;
//Q1.
public class StringBasic {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1==str2);//both refer to same point in scp string constant pool
		String s1=new String("Java");
		String s2=new String("Java");
		System.out.println(s1==s2);//both refer to different location in heap but same in scp
		
	}

}
