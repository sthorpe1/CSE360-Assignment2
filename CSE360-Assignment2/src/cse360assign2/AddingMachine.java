package cse360assign2;
/**
 * File includes constructor for AddingMachine 
 * total as well as the getTotal(), add(), subtract(), toString(), 
 * and clear() functions.
 * @author Sean F. Thorpe
 * @param total This is the private int used to track total number value.
 * @param record This is the private String that 
 * holds each operation performed.
 */
/*
 * Author: Sean F. Thorpe
 * Class ID: 85141 CSE360
 * Assignment 2
 * The file Palindrome.java constructs a class for AddingMachine
 * and then provides multiple functions to manipulate the total variable
 * these range from adding to subtracting as well as obtaining the total, 
 * the list of operations performed, and clearing/resetting the variables.
 */
public class AddingMachine {

	private int total;
	private String record;
	/**
	 * AddingMachine() is the constructor for the AddingMachine class.
	 * @param total sets the total to 0 in the constructor.
	 * @param record sets the initial string of operations to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		record = "0";
	}
	
	/**
	 * getTotal() returns the total int variable.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add() takes an integer value and adds it to the total variable
	 * then records the operation in the string variable.
	 * @param value Is the value inputed by 
	 * the user when the function is called.
	 */
	public void add (int value) {
		record += " + " + value;
		total += value;
	}
	
	/**
	 * subtract() takes an integer value and 
	 * subtracts it from the total variable and then 
	 * records it in the string variable.
	 * @param value is the number inputed by the 
	 * user when the function is called.
	 */
	public void subtract (int value) {
		record += " - " + value;
		total -= value;
	}
		
	/**
	 *	toString() returns the record value when the
	 *	function is called. 
	 */
	public String toString () {
		return record;
	}

	/**
	 * clear() resets the total variable and 
	 * clears the record string variable.	 
	 */
	public void clear() {
		record = "0";
		total = 0;
		
	}
}
