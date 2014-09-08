
public class Monster {

	// Instance Variables
	int health;
	int damageMax;
	int damageMin;
	
	// Constructor
	 public Monster(int health, int damageMax, int damageMin) {
		 this.health = health;
		 this.damageMax = damageMax;
		 this.damageMin = damageMin;
	 }
	
	// Methods
	public int attack(){
		int attack = (int) (Math.random() * (damageMax - damageMin) + damageMin);
		return attack;
	}
}
