package cse360assign2;

/**
 * The AddingMachine class allows calls to add or subtract numbers, 
 * while keeping track of the history. 
 * <p>
 * Assignment 2
 * @author Jacob Abraham ID: 1214473169
 */
public class AddingMachine {

	/**
	 * The current total of the numbers, 
	 * modified by either adding or subtracting.
	 */
	private int total;
	
	/**
	 * Class constructor, just initialize variables
	 */
	public AddingMachine() {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Return the total amount of the adding machine.
	 * @return the total amount, <code>total</code>
	 */
	public int getTotal() {
		return 0;
	}
	
	/**
	 * Add the inputed amount to the total and update the history.
	 * @param value the value to add to the total
	 */
	public void add(int value) {
		
	}
	
	/**
	 * Subtract the inputed amount from the total and update the history.
	 * @param value the value to subtracted from the total
	 */
	public void subtract(int value) {
		
	}
		
	/**
	 * Return the history of additions and subtractions.
	 */
	public String toString() {
		return "";
	}

	/**
	 * Reset the total and history.
	 */
	public void clear() {
	
	}
}
