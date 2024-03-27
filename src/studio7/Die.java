package studio7;

public class Die {
	
	private int sides;
	
	private Die(int initSides) {
		sides = initSides;
	}
	
	public int rollDie(int sides) {
		int rollResult = (int)(Math.random() * sides + 1);
		
		return rollResult;
		
	}
	public String toString() {
		String string = "Number of sides: " + this.sides + ", Roll result: " + rollDie(sides);
		
		return string;
	}
	
	
	public static void main(String[] args) {
		
		Die die1 = new Die(32);
		System.out.println(die1.toString());
	}

}
