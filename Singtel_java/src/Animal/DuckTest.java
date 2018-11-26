package Animal;


import static org.junit.Assert.*;
import org.junit.Test;

public class DuckTest {

	public DuckTest()
	{
		
	}
	
	@Test
	public void can_soundTestPass() {
		Duck ch = new Duck();
		assertTrue("Quack,quack".equals(ch.can_sound()));
	}
	
	@Test
	public void can_soundTestFail() {
		Duck ch = new Duck();
		assertTrue("Quack,quack...oooo".equals(ch.can_sound()));
	}
	
	@Test
	public void swimTestPass() {
		Duck ch = new Duck();
		assertTrue("A duck can swim".equals(ch.swim()));
	}
	
	@Test
	public void swimTestFail() {
		Duck ch = new Duck();
		assertTrue("A duck cannot swim...oooo".equals(ch.fly()));
	}
	
	
	
	
}