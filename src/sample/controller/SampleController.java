package sample.controller;
import java.util.Scanner;

public class SampleController 
{
	public void start()
	{
		System.out.println("This is a sample project to show the github");
		System.out.println("and eclipse process and develop muscle memory");
		testScanner();
	}
	
	private void testScanner()
	{
		//Declares and substantiates scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = input.nextLine();
		System.out.println("Oh, you like to eat " + answer + "!");
	}
}
