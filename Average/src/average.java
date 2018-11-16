import java.util.Scanner;
public class average {
	
	// Variables
	Scanner scanner;
	double first;
	double second;
	double third;
	double fourth;
	double fifth;
	
	
		public void average() {
			
			Scanner scanner = new Scanner(System.in);
			
			// Program description
			System.out.println("Enter 5 numbers and I will return the average.");
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("First number: ");
			int first = scanner.nextInt();
			
			System.out.println("Second number: ");
			int second = scanner.nextInt();
			
			System.out.println("Third number: ");
			int third = scanner.nextInt();
			
			System.out.println("Fourth number: ");
			int fourth = scanner.nextInt();
			
			System.out.println("Fifth number: ");
			int fifth = scanner.nextInt();
			
			System.out.println("The average of the numbers you selected is: " + (first + second + third + fourth + fifth) / 5);
			
		}
	public static void main(String[] args) {
		average myaverage = new average();
		myaverage.average();

	}

}
