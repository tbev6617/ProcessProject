package sample.controller;
import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohSquare;

public class SampleController 
{
	public SampleController() 
	{
		
	}
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle = new PlayDohCircle();
		PlayDohCircle thirdCircle = new PlayDohCircle(10);
		
		PlayDohSquare smallSquare = new PlayDohSquare();
		PlayDohSquare bigSquare = new PlayDohSquare(10);
		
		System.out.println("Here is my play doh circle");
		System.out.println(firstCircle.toString());
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
