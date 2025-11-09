/* Nice. clean and Math library is used correctly */

// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Get the three names from command line arguments
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

		// Get the bill amount and convert to integer
		int billAmount = Integer.parseInt(args[3]);

		// Calculate amount per person (rounded up)
		double amountPerPerson = Math.ceil(billAmount / 3.0);

		// Build the output string (names in reverse order)
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + amountPerPerson + " Shekels each.");
	}
}
