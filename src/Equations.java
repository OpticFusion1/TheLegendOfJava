import java.util.*;
public class Equations {

	// Instance Variables
	int a = 0;
	int b = 0;
	int c = 0;
	int intResult;
	String result;
	String equation;
	
	// Constructors
	public Equations(int type) {
		if (type == 1) {
			a = (int)(Math.random() * (10-1) +1);
			b = (int)(Math.random() * (10-1) +1);
			c = (int)(Math.random() * (10-3) +3);
			intResult = (a + b) * c;
			result = (""+intResult);
			equation = "(" + a + " + " + b + ")" + " * " + c;
		} else if (type == 2) {
			
		}
	}
	
	// Getters and Setters
	public String getResult() {
		return result;
	}
	
	public String getEquation() {
		return equation;
	}
}
