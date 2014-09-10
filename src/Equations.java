import java.util.*;
public class Equations {

	// Instance Variables
	int a = 0;
	int b = 0;
	int c = 0;
	int result;
	String equation;
	
	// Constructors
	public Equations(int type) {
		if (type == 1) {
			a = (int)(Math.random() * (10-1) +1);
			b = (int)(Math.random() * (10-1) +1);
			c = (int)(Math.random() * (10-3) +3);
			result = (a + b) * c;
			equation = "(" + a + " + " + b + ")" + " * " + c;
		} else if (type == 2) {
			
		}
	}
	
	// Getters and Setters
	public int getResult() {
		return result;
	}
	
	public String getEquation() {
		return equation;
	}
}
