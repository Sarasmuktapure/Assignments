package com.Assignment6;
//Q6.

interface Cake
{
	void bake();
}
class Strawberry implements Cake
{

	@Override
	public void bake() {
		System.out.println("It is stawberry cake");
		
	}
	
}
class BlackForest implements Cake
{

	@Override
	public void bake() {
		System.out.println("It is blackforest cake");
		
	}
	
}

public class InterfaceQ6 {

	public static void main(String[] args) 
	{
		Strawberry s=new Strawberry();
		BlackForest b=new BlackForest();
		s.bake();
		b.bake();
		

	}

}
