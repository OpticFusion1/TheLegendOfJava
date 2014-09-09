
public class Player {
	
	//////////////////////////////
	// Instance variables
	//////////////////////////////
	String name;
	byte health;
	int score;
	int damageMax;
	int damageMin;
	
	// Construktor
	public Player(String name, byte health, int damageMax, int damageMin) {
		this.name = name;
		this.health = health;
		this.score = 0;
		this.damageMax = damageMax;
		this.damageMin = damageMin;
	}
	
	
	//////////////////////////////
	// Methods
	//////////////////////////////
	public int attack(int time) {
		return 10 * time;
	}
	
	public int getHealth() {
		return health;
	}

}
