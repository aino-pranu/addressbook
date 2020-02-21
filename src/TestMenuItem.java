import static org.junit.Assert.*;

import org.junit.Test;

import com.assignment.MenuItem;

public class TestMenuItem {

	@Test
	public void testMenuItem() {
		
		MenuItem mi = new MenuItem();
		mi.setCh(1);
		equals(mi.getCh());
		
	}

}
