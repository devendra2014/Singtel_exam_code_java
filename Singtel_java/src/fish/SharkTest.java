package fish;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SharkTest {

	public SharkTest()
	{
		
	}
	
		
	@Test
	public void largeTestPass() {
		Shark ch = new Shark();
		assertTrue("Shark are large".equals(ch.large()));
	}
	
	@Test
	public void largeTestFail() {
		Shark ch = new Shark();
		assertTrue("Shark are large...oooo".equals(ch.large()));
	}

	@Test
	public void greyTestPass() {
		Shark ch = new Shark();
		assertTrue("they are grey in colour".equals(ch.grey()));
	}
	
	@Test
	public void greyTestFail() {
		Shark ch = new Shark();
		assertTrue("they are grey in colour...oooo".equals(ch.grey()));
	}

	@Test
	public void eatTestPass() {
		Shark ch = new Shark();
		assertTrue("Shark eat other fish".equals(ch.eat()));
	}
	
	@Test
	public void eatTestFail() {
		Shark ch = new Shark();
		assertTrue("Shark eat other fish...oooo".equals(ch.eat()));
	}
}
