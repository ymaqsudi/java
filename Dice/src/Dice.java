import java.util.Random;
public class Dice {

	public static void main(String[] args) {
		// Dice will have six numerical sides
		Random dice = new Random();
		
		// Number that the side landed on
		int number;
		
		// For loop that rolls the dice six times
		for(int rolls = 1;rolls < 6; rolls++) {
			number = 1 + dice.nextInt(6);
			System.out.println(number);
		}

	}

}
