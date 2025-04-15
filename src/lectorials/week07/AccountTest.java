package lectorials.week07;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;



public class AccountTest {	
	private Account testAccount;
	
	@Before
	public void setUp() {
		this.testAccount = new Account("s123", "Estrid", 100);
	}
	
	@Test
	public void testAddInterestWithPositiveRate() {
		this.testAccount.addInterest(0.01); // expecting 101 as the balance
		
		assertEquals(this.testAccount.getBalance(), 101, 1e-10);		
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testAddInterestWithNegativeRate() {
		this.testAccount.addInterest(-0.1);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testAddInterestWithVeryLargeRate() {
		this.testAccount.addInterest(100.0); 
			
	}
	
	@After
	public void tearDown() {
		this.testAccount = null;
	}
	
	
	
}