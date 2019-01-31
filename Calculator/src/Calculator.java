import java.util.Scanner;
public class Calculator {
	
	Scanner scanner;


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		System.out.println("1 - Addition \n2 - Subtraction\n3 - Multiplication\n4 - Division");
		int op = scanner.nextInt();
		
		System.out.println("Enter the first number. ");
		int x = scanner.nextInt();
		
		System.out.println("Enter the second number. ");
		int y = scanner.nextInt();
		
		switch (op) {
			case 1: System.out.println(x + y);
			System.out.println();
			System.out.println();
				break;
			case 2: System.out.println(x - y);
			System.out.println();
			System.out.println();
				break;
			case 3: System.out.println(x * y);
			System.out.println();
			System.out.println();
				break;
			case 4: System.out.println(x / y);
			System.out.println();
			System.out.println();
				break;
			default: System.out.println("That operation is not inlcuded in this program.");
		}
				
		}

	}

}

