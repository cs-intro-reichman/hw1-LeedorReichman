// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// Get the number from command line arguments
		int number = Integer.parseInt(args[0]);

		// Calculate hundreds, tens, and ones
		// hundreds should be the total count of hundreds (e.g., 2024 -> 20 hundreds)
		int hundreds = number / 100;
		int tens = (number / 10) % 10;
		int ones = number % 10;

		// Print the result in the required format
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
