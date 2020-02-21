import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment.Address;

public class TestAddress {

	@Test
	public void testAddress() {
		Address a = new Address("solapur", "mumbai", 8);
		a.setStreet("solapur");
		assertTrue(a.getStreet() == "solapur" );
	}

}
