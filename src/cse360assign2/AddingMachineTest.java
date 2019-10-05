package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The AddingMachineTest class contains unit tests for 
 * {@link cse360assign2.AddingMachine}.
 * <p>
 * Assignment 1
 * @author Jacob Abraham ID: 1214473169
 */
public class AddingMachineTest {

	@Test
	public void testInitial() {
		AddingMachine machine = new AddingMachine();
		
		//test initial condition
		assertEquals(0, machine.getTotal());
		assertEquals("0", machine.toString());
	}
	
	@Test
	public void testAddingPositive() {
		AddingMachine machine = new AddingMachine();
		
		//test adding some positive numbers
		machine.add(5);
		assertEquals(5, machine.getTotal());
		assertEquals("0 + 5", machine.toString());
		
		machine.add(17);
		assertEquals(22, machine.getTotal());
		assertEquals("0 + 5 + 17", machine.toString());
	}
	
	@Test
	public void testSubtratingPositive() {
		AddingMachine machine = new AddingMachine();
		
		//test subtracting some positive numbers
		machine.subtract(9);
		assertEquals(-9, machine.getTotal());
		assertEquals("0 - 9", machine.toString());
		
		machine.subtract(32);
		assertEquals(-41, machine.getTotal());
		assertEquals("0 - 9 - 32", machine.toString());
	}
	
	@Test
	public void testAddingSubtratingPositive() {
		AddingMachine machine = new AddingMachine();
		
		//test both adding and subtracting some positive numbers
		machine.subtract(9);
		assertEquals(-9, machine.getTotal());
		assertEquals("0 - 9", machine.toString());
		
		machine.add(12);
		assertEquals(3, machine.getTotal());
		assertEquals("0 - 9 + 12", machine.toString());
		
		machine.subtract(56);
		assertEquals(-53, machine.getTotal());
		assertEquals("0 - 9 + 12 - 56", machine.toString());
		
		machine.subtract(42);
		assertEquals(-95, machine.getTotal());
		assertEquals("0 - 9 + 12 - 56 - 42", machine.toString());
		
		machine.add(107);
		assertEquals(12, machine.getTotal());
		assertEquals("0 - 9 + 12 - 56 - 42 + 107", machine.toString());
	}
	
	@Test
	public void testAddingNegative() {
		AddingMachine machine = new AddingMachine();
		
		//test adding some negative numbers
		machine.add(-5);
		assertEquals(-5, machine.getTotal());
		assertEquals("0 + -5", machine.toString());
		
		machine.add(-17);
		assertEquals(-22, machine.getTotal());
		assertEquals("0 + -5 + -17", machine.toString());
	}
	
	@Test
	public void testSubtratingNegative() {
		AddingMachine machine = new AddingMachine();
		
		//test subtracting some negative numbers
		machine.subtract(-9);
		assertEquals(9, machine.getTotal());
		assertEquals("0 - -9", machine.toString());
		
		machine.subtract(-32);
		assertEquals(41, machine.getTotal());
		assertEquals("0 - -9 - -32", machine.toString());
	}
	
	@Test
	public void testAddingSubtratingNegative() {
		AddingMachine machine = new AddingMachine();
		
		//test both adding and subtracting some negative numbers
		machine.subtract(-9);
		assertEquals(9, machine.getTotal());
		assertEquals("0 - -9", machine.toString());
		
		machine.add(-12);
		assertEquals(-3, machine.getTotal());
		assertEquals("0 - -9 + -12", machine.toString());
		
		machine.subtract(-56);
		assertEquals(53, machine.getTotal());
		assertEquals("0 - -9 + -12 - -56", machine.toString());
		
		machine.subtract(-42);
		assertEquals(95, machine.getTotal());
		assertEquals("0 - -9 + -12 - -56 - -42", machine.toString());
		
		machine.add(-107);
		assertEquals(-12, machine.getTotal());
		assertEquals("0 - -9 + -12 - -56 - -42 + -107", machine.toString());
	}
	
	@Test
	public void testClear() {
		AddingMachine machine = new AddingMachine();
		
		//test both doing some operations then clearing
		machine.add(7);
		machine.subtract(2);
		machine.clear();
		assertEquals(0, machine.getTotal());
		assertEquals("0", machine.toString());
		
		//test that adding machine still works
		machine.add(-3);
		assertEquals(-3, machine.getTotal());
		assertEquals("0 + -3", machine.toString());
	}
}
