package money.dollar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteMoney {

	@Test
	public void testEquality() {
		   assertTrue(Money.dollar(5).equals(Money.dollar(5))); 
		   assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		   assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}	
	
	public void testDifferentClassEquality() {
		   assertTrue(new Money(10, "CHF").equals(new Money(10, "CHF")));
	}

		
	public void testMultiplication() {
		   Money five = Money.dollar(5);
		   assertEquals(Money.dollar(10), five.times(2));
		   assertEquals(Money.dollar(15), five.times(3));
	}
	
	public void testCurrency() {
		   assertEquals("USD", Money.dollar(1).currency());
		   assertEquals("CHF", Money.franc(1).currency());
	}

}
