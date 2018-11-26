package fish;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DolphinTest {

	public DolphinTest()
	{
		
	}
	
		
	@Test
	public void swimTestPass() {
		Dolphin ch = new Dolphin();
		assertTrue("Dolphin can swim".equals(ch.swim()));
	}
	
	@Test
	public void swimTestFail() {
		Dolphin ch = new Dolphin();
		assertTrue("Dolphin can swim...oooo".equals(ch.swim()));
	}
}
