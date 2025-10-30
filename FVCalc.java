// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Get the current value (investment amount)
		int currentValue = Integer.parseInt(args[0]);

		// Parse the interest rate input (keep the raw value for printing)
		double rateInput = Double.parseDouble(args[1]);
		// Convert percentage to decimal for calculations
		double rate = rateInput / 100.0;

		// Get the number of years
		int years = Integer.parseInt(args[2]);

		// Calculate future value using the formula: currentValue * (1 + rate)^years
		int futureValueInt = (int) (currentValue * Math.pow(1 + rate, years));

		// Print the result with the cleaned rate string and integer future value
		System.out.println("After " + years + " years, $" + currentValue +
						" saved at " + rateInput + "% will yield $" + futureValueInt);
	}
}