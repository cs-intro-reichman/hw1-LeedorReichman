// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Get the current value (investment amount)
		int currentValue = Integer.parseInt(args[0]);

		// Get the interest rate as a double and convert from percentage to decimal
		double rate = Double.parseDouble(args[1]) / 100.0;

		// Get the number of years
		int years = Integer.parseInt(args[2]);

		// Calculate future value using the formula: currentValue * (1 + rate)^years
		double futureValue = currentValue * Math.pow(1 + rate, years);

		// Print the result, casting the future value to an integer
		System.out.println("After " + years + " years, $" + currentValue + 
						  " saved at " + args[1] + ".0% will yield $" + (int)futureValue);
	}
}