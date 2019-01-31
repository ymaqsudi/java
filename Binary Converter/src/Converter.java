
public class Converter {

	public static void main(String[] args) {
		
		// Divide the number by 2 until you get a quotient of 1
		// Print the remainders of the numbers backwards (Starting from 1)
		
		// Assigning X to equal any number and creating an array with 1000 units
		int x = 28;
		int binaryNum[] = new int[10000];
		
		
		// Getting the remainder for each number
		int i = 0;
		while (x > 0) {
			binaryNum[i] = x % 2;
			x = x / 2;
			i++;
			
		}
		
		// Printing the remainders in the array in backwards order
		for (int z = i - 1; z >= 0; z--) 
            System.out.print(binaryNum[z]);
		

	}

}
