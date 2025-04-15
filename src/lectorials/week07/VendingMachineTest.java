package lectorials.week07;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	private VendingMachine machine;
	
	@Before
	public void setUp() {
		machine = new VendingMachine();
	}
	
	@Test
	public void testAddItem_Availability() {
		machine.addItem(new Item("pen", 1.0, 10));
		assertTrue(machine.checkAvailability("pen"));
	}
	
	@Test
	public void testAddItem_Quantity() {
		machine.addItem(new Item("pen", 1.0, 10));

		assertEquals(machine.checkQuantity("pen"), 10, 0.0);
	}
	
	@Test
	public void testAddItem_InvalidQuantity() {
		machine.addItem(new Item("pen", 1.0, -10));
		assertFalse(machine.checkAvailability("pen"));
	}
	
	
	
	
}
