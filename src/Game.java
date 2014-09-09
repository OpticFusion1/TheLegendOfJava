import java.util.*;
public class Game {


	public static void main(String[] args){
		
		///////////////////////////////////////////////////
		// Starting the game and setting up the player
		///////////////////////////////////////////////////
		Scanner input = new Scanner (System.in);
		
		// Player name
		System.out.println("Welcome to Legend of Java \nPlease enter your name:");
		String playerName = input.next();
		
		// Player difficulty ---> health
		System.out.println("\nDo you wish to play the game on Easy, Medium or Hard? \nType E, M or H");
		String difficultyLevel = input.next();
		byte playerHealth = 0;
		int playerMaxDamage = 0;
		int playerMinDamage = 0;
		while (!(difficultyLevel.equalsIgnoreCase("E") || difficultyLevel.equalsIgnoreCase("M") || difficultyLevel.equalsIgnoreCase("H"))) {
			System.out.println("\nYou didn't enter the right character, type E, M or H");
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
		Player player1 = new Player(playerName, playerHealth, playerMaxDamage, playerMinDamage);
		System.out.println("\nHello " + playerName + "! \nYou start you quest with a full health of " + playerHealth + "\nand an attack interval of " + playerMinDamage + " - " + playerMaxDamage + ".");
		System.out.println("Good luck battleling the monsters. \nLet the legend of Java BEGIN!");
	
			
		///////////////////////////////////////////////////
		// The Game
		///////////////////////////////////////////////////	
		
		// Introductory text
		System.out.println("\n \nYou have entered the catacombs of the Java, the evil Math Monster");
		System.out.println("On the first level of his catacombs you must defeat 5 monsters to continue on you quest");
		
		// First level
		int randomType = (int)(Math.random() * (3-1) + 1);
		Monster firstMonster = new Monster(randomType);
		While (player1.getHealth() > 0 && firstMonster.getHealth() > 0) {
			//Not done yet
		}

	}

}
