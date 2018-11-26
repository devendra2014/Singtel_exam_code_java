package insects;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import Animal.Rooster;

public class ButterflyTest {

	public ButterflyTest()
	{
		
	}
	
	
	
	@Test
	public void flyTestPass() {
		Butterfly ch = new Butterfly();
		assertTrue("Butterfly can fly".equals(ch.fly()));
	}
	
	@Test
	public void flyTestFail() {
		Butterfly ch = new Butterfly();
		assertTrue("Butterfly can fly...oooo".equals(ch.fly()));
	}
	
	@Test
	public void can_soundTestPass() {
		Butterfly ch = new Butterfly();
		assertTrue("Does not make sound".equals(ch.can_sound()));
	}
	
	@Test
	public void can_soundTestFail() {
		Butterfly ch = new Butterfly();
		assertTrue("Butterfly Does not make sound...oooo".equals(ch.can_sound()));
	}
	
}
