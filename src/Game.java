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
		byte playerHealth = 0;
		int playerMaxDamage = 0;
		int playerMinDamage = 0;
		while (!(difficultyLevel.equalsIgnoreCase("E") || difficultyLevel.equalsIgnoreCase("M") || difficultyLevel.equalsIgnoreCase("H"))) {
			System.out.println("You didn't enter the right character, type E, M or H");
			difficultyLevel = input.next();
		}
			if (difficultyLevel.equalsIgnoreCase("E")) {
				playerHealth = 100;
				playerMaxDamage = 8;
				playerMinDamage = 4;
				System.out.println("You choose to play the game on easy mode");
			} else if (difficultyLevel.equalsIgnoreCase("M")) {
				playerHealth = 80;
				playerMaxDamage = 6;
				playerMinDamage = 3;
				System.out.println("You choose to play the game on medium mode");
			} else if (difficultyLevel.equalsIgnoreCase("H")) {
				playerHealth = 60;
				playerMaxDamage = 4;
				playerMinDamage = 2;
				System.out.println("You choose to play the game on hard mode");
			}
		
		//Constructing player
			Player Player1 = new Player(playerName, playerHealth, playerMaxDamage, playerMinDamage);
			System.out.println("Hello " + playerName + ", \nYou start you quest with a full health of " + playerHealth + "\nAnd an attack interval of " + playerMinDamage + " - " + playerMaxDamage);
			
	}

}
