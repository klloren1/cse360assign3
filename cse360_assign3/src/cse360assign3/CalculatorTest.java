package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator temp = new Calculator();
		assertNotNull(temp);
	}

	@Test
	public void testGetTotal() {
		Calculator temp = new Calculator();
		assertEquals(0, temp.getTotal());
		temp.add(5);
		assertEquals(5,temp.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator temp = new Calculator();
		temp.add(2);
		temp.add(3);
		assertEquals(5, temp.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator temp = new Calculator();
		temp.add(5);
		temp.subtract(3);
		assertEquals(2, temp.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator temp = new Calculator();
		temp.add(2);
		temp.multiply(3);
		assertEquals(6, temp.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator temp = new Calculator();
		temp.add(8);
		temp.divide(4);
		assertEquals(2, temp.getTotal());
		temp.divide(0);
		assertEquals(0,temp.getTotal());//divide by zero test
	}

	@Test
	public void testGetHistory() {
		Calculator temp = new Calculator();
		assertEquals("", temp.getHistory());
	}

}
