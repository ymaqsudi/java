import java.util.Random;
import java.util.Scanner;


public class Gladiator {

	Random outcome = new Random();
	
	int choice;
	int fate;
	int choice2;
	Scanner scanner;
	
	
	public void gladiator() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your an 18 year old gladiator during the Pax Romana. \n Type one if you would like to fight.");
		choice = scanner.nextInt();
		
		if(choice == 1) {
		
		fate = 1 + outcome.nextInt(6);
		
		if(fate % 2 == 0) {
			System.out.println("You have died in the arena.");
		} else {
			System.out.println("You have won your gladiator fight!");
			System.out.println("You tried to escape the imperial guards, but you were caught and fed to the lion.");
			System.out.println("Your only option is too fight the lion. Press 2 to continue.");
			choice2 = scanner.nextInt();
			
			if(choice2 == 2) {
				fate = 1 + outcome.nextInt(6);
				
				if(fate % 2 ==0) {
					System.out.println("You have been eaten by the lion.");
				} else {
					System.out.println("You successfully killed the lion and are free to return home.");
				} 
			} else {
				System.out.println("Thank you for playing.");
			}
		}
		}
	} 
		
		
	 
	
	
	public static void main(String[] args) {
		Gladiator fight = new Gladiator();
		
		fight.gladiator();

	}

}
