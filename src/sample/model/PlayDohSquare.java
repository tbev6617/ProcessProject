package sample.model;

public class PlayDohSquare 
{
	private int sideLength;
	public PlayDohSquare()
	{
		this.sideLength = 5;
	}
	public PlayDohSquare(int sideLength)
	{
		this.sideLength = sideLength;
	}
	public String toString() {
		String description = "I am a square and my side length is " + sideLength;
		return description;
	}
}
