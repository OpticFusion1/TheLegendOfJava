
public class Player {
	
	//////////////////////////////
	// Instance variables
	//////////////////////////////
	String name;
	int health;
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
		int attackNum = 0;
		if (time < 30) {
			attackNum = damageMax;
		} else if (time < 60) {
			attackNum = damageMax - 1;
		} else if (time > 60) {
			attackNum = damageMin;
		} 
		return attackNum;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int damage) {
		health = health - damage; 
	}

}
