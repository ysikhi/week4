import static org.junit.Assert.*;

import org.junit.Test;

public class houseconcostTest {
	houseconcost t=new houseconcost();
    
	@Test
	public void testCost() {
		assertEquals(250000.0,t.est(4 , 100, true),0);
		
	}

}
