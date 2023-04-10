package com.Assignment6;
//Q10.

interface MusicalInstrument
{
	void play();
	static void learnInstrument()
	{
		System.out.println("Learning...........");
	}
}
abstract class Sound
{
	abstract void listenSound();
	
}
class PercussionInstrument extends Sound implements  MusicalInstrument
{

	@Override
	public void play() 
	{
		System.out.println("Play tabla");
	}

	@Override
	void listenSound()
	{
		System.out.println("Listen tabla");
	}
	
}
class StringedInstrument extends Sound implements  MusicalInstrument
{

	@Override
	public void play() 
	{
		System.out.println("Play violin");
	}

	@Override
	void listenSound() 
	{
		System.out.println("Listen violin");
	}
	
}
public class InterfaceQ10 {

	public static void main(String[] args)
	{
		PercussionInstrument tabla=new PercussionInstrument();
		StringedInstrument violin=new StringedInstrument();
		tabla.play();
		tabla.listenSound();
		violin.play();
		violin.listenSound();
		

	}

}
