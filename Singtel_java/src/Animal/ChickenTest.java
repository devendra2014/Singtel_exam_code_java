package Animal;


import static org.junit.Assert.*;
import org.junit.Test;

public class ChickenTest {

	public ChickenTest()
	{
		
	}
	
	@Test
	public void can_soundTestPass() {
		Chicken ch = new Chicken();
		assertTrue("kuklooku".equals(ch.can_sound()));
	}
	
	@Test
	public void can_soundTestFail() {
		Chicken ch = new Chicken();
		assertTrue("kuklooku....oooo".equals(ch.can_sound()));
	}
	
	@Test
	public void flyTestPass() {
		Chicken ch = new Chicken();
		assertTrue("I cannot fly".equals(ch.fly()));
	}
	
	@Test
	public void flyTestFail() {
		Chicken ch = new Chicken();
		assertTrue("I cannot fly...oooo".equals(ch.fly()));
	}
	
	
	
	
}