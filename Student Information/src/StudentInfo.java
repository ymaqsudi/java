import java.util.Scanner;
public class StudentInfo {
	Scanner scanner;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String heshe;
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your average: ");
		int average = scanner.nextInt();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.print("You are a male (true or false): ");
		boolean isMale = scanner.nextBoolean();
		heshe = isMale ? "He" : "She";
		
		// Concatenation of multiple variables
		System.out.printf("%s is %d years old. %s has a %d average.", name, age, heshe, average);
		

	}

}
