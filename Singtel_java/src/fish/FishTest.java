package fish;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class FishTest {

	public FishTest()
	{
		
	}
	
		
	@Test
	public void swimTestPass() {
		Fish ch = new Fish();
		assertTrue("Fish can swim".equals(ch.swim()));
	}
	
	@Test
	public void swimTestFail() {
		Fish ch = new Fish();
		assertTrue("Fish can swim...oooo".equals(ch.swim()));
	}
}
