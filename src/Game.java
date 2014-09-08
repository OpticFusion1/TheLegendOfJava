import java.util.*;
public class Game {


	public static void main(String[] args){
		///////////////////////////////////////////////////
		// Starting the game and setting up the player
		///////////////////////////////////////////////////
		Scanner input = new Scanner (System.in);
		
		// Player name
		System.out.println("Welcome to Legend of Java \n Please enter your name:");
		String playerName = input.next();
		
		// Player difficulty and health
		System.out.println("Do you wish to play the game on Easy, Medium or Hard? \n Type E, M or H");
		String difficultyLevel = input.next();
		int playerhealth = 0;
		while (!(difficultyLevel.equalsIgnoreCase("E") || difficultyLevel.equalsIgnoreCase("M") || difficultyLevel.equalsIgnoreCase("H"))) {
			System.out.println("You didn't enter the right character, type E, M or H");
			difficultyLevel = input.next();
		}
			if (difficultyLevel.equalsIgnoreCase("E")) {
				playerhealth = 100;
				System.out.println("You choose to play the game on easy mode");
			} else if (difficultyLevel.equalsIgnoreCase("M")) {
				playerhealth = 80;
				System.out.println("You choose to play the game on medium mode");
			} else if (difficultyLevel.equalsIgnoreCase("H")) {
				playerhealth = 60;
				System.out.println("You choose to play the game on hard mode");
			}
		
	}

}
