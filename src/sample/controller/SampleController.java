package sample.controller;
import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohSquare;

public class SampleController 
{
	public void start()
	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle = new PlayDohCircle();
		PlayDohCircle thirdCircle = new PlayDohCircle(10);
		
		PlayDohSquare smallSquare = new PlayDohSquare();
		PlayDohSquare bigSquare = new PlayDohSquare(10);
		
		System.out.print("Here is my play doh circle. ");
		System.out.println(firstCircle);
		System.out.println("This is my second circle. " + secondCircle);
		System.out.println("This is my third circle. " + thirdCircle);
		System.out.println("This is my small square. " + smallSquare);
		System.out.println("This is my big square. " + bigSquare);
		testScanner();
	}
	
	private void testScanner()
	{
		//Declares and substantiates scanner object
		Scanner input = new Scanner(System.in);
		
		/* I commented out the food question
		System.out.println("What is your favorite food?");
		String answer = input.nextLine();
		System.out.println("Oh, you like to eat " + answer + "!\n");
		*/
		PlayDohCircle userCircle = new PlayDohCircle();
		System.out.println("Here is your circle before I change it: " + userCircle);
		System.out.println("How big do you want your circle's size to be? Use numbers please.");
		userCircle.setSize(input.nextInt());
		System.out.println("Here is your new circle: " + userCircle);
	}
}
