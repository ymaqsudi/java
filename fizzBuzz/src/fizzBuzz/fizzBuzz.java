package fizzBuzz;

// If number is a multiple of 3, print fizz
// If number is a multiple of 5, print buzz
// If number is a multiple of 3 and 5, print fizzbuzz

public class fizzBuzz {
	
	

	public static void main(String[] args) {
		int n = 100;
		
		for (int i=1; i<=n; i++) {
			if (i <= 100) {
			
			
				
				if (i % 3 == 0 && i % 5 != 0) {
					System.out.println("fizz");
				} else if (i % 3 != 0 && i % 5 == 0) {
					System.out.println("buzz ");
				} else if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("fizzbuzz");
				} else {
					System.out.print(i);
				}
			}
		
		
		}
		}
	}

//hi

//hello