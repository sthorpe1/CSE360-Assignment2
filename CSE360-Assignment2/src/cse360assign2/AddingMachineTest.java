/*
 * Author: Sean F. Thorpe
 * Class ID: 85141 CSE360
 * Assignment 2
 * The AddingMachineTest.java file runs a test case for
 * the AddinMachine class in order to make sure it performs operations
 * and displays the correct string/total.
 */
package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingMachineTest {

	@Test
	public void test() {
		// Creates an instance of the object then adds, subtracts, 
		// displays total as well as the list of operations
		AddingMachine test1 = new AddingMachine();
		test1.add(1);
		test1.subtract(5);
		System.out.println(test1.toString());
		System.out.println(test1.getTotal());
	}

}