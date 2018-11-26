package fish;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClownfishTest {

	public ClownfishTest()
	{
		
	}
	
		
	@Test
	public void smallTestPass() {
		Clownfish ch = new Clownfish();
		assertTrue("Clownfish are small".equals(ch.small()));
	}
	
	@Test
	public void smallTestFail() {
		Fish ch = new Fish();
		assertTrue("Clownfish are small...oooo".equals(ch.small()));
	}
	
	
	@Test
	public void colourfulTestPass() {
		Clownfish ch = new Clownfish();
		assertTrue("they are Orange in colour".equals(ch.colourful()));
	}
	
	@Test
	public void colourfulTestFail() {
		Fish ch = new Fish();
		assertTrue("they are Orange in colour...oooo".equals(ch.colourful()));
	}
	

}
