
public class Monster {

	// Instance Variables
	int health;
	int damageMax;
	int damageMin;
	String type;
	
	// Constructors
	 public Monster(int health, int damageMax, int damageMin) {
		 this.health = health;
		 this.damageMax = damageMax;
		 this.damageMin = damageMin;
	 }
	public Monster(int typeNum){
		if (typeNum == 1){
			this.health = 20;
			this.damageMax = 2;
			this.damageMin = 1;
			this.type = "Colos";
		} else if (typeNum == 2) {
			this.health = 15;
			this.damageMax = 3;
			this.damageMin = 1;
			this.type = "Imp";
		} else if (typeNum == 3) {
			this.health = 7;
			this.damageMax = 5;
			this.damageMin = 1;
			this.type = "Ninja";
		}
	}
	
	// Methods
	public int attack(){
		int attack = (int) (Math.random() * (damageMax - damageMin) + damageMin);
		return attack;
	}
	
	public int getHealth() {
		return health;
	}
	public String getType() {
		return type;
	}
}
