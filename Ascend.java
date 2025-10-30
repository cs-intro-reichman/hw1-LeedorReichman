// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Gets the range from command line arguments
		int lim = Integer.parseInt(args[0]);

		// Generate three random numbers in range [0,lim)
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random() * lim);
		int c = (int)(Math.random() * lim);

		// Print the numbers in original order
		System.out.println(a + " " + b + " " + c);

		// Find min using nested Math.min calls
		int min = Math.min(Math.min(a, b), c);
		
		// Find max using nested Math.max calls
		int max = Math.max(Math.max(a, b), c);
		
		// Find middle value: sum of all numbers minus min and max
		int middle = a + b + c - min - max;

		// Print the numbers in ascending order
		System.out.println(min + " " + middle + " " + max);
	}
}
