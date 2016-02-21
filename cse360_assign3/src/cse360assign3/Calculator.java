
package cse360assign3;

/**
 * Class for performing mathematical operations via a simulated calculator.
 * 
 * @author Kyle Lorenzano PIN:517
 *
 */
public class Calculator {

	private int total;
	
	/**
	 * Constructs a Calculator object with total initialized to zero.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the running total after operations.
	 * 
	 * @return integer of current total.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds a given integer to the total.
	 * 
	 * @param value integer to be added.
	 */
	public void add (int value) {
		total += value;
	}
	
	/**
	 * Subtracts a given integer from the total.
	 * 
	 * @param value integer to be subtracted.
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * Multiplies the total by a given integer.
	 * 
	 * @param value integer to multiply by.
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * Divides the total by a given integer.
	 * 
	 * @param value integer to divide by.
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
		
	}
	
	/**
	 * Returns the history of operations in a string.
	 * 
	 * @return String of operational history.
	 */
	public String getHistory () {
		return "";
	}
}