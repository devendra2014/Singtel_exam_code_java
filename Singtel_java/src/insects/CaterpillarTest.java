package insects;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CaterpillarTest {

	public CaterpillarTest()
	{
		
	}
	
	
	
	@Test
	public void flyTestPass() {
		Caterpillar ch = new Caterpillar();
		assertTrue("A catterpillar cannot fly".equals(ch.fly()));
	}
	
	@Test
	public void flyTestFail() {
		Caterpillar ch = new Caterpillar();
		assertTrue("A catterpillar cannot fly..oooo".equals(ch.fly()));
	}
	
	
	@Test
	public void walkTestPass() {
		Caterpillar ch = new Caterpillar();
		assertTrue("A caterpillar can walk (crawl)".equals(ch.walk()));
	}
	
	@Test
	public void walkTestFail() {
		Caterpillar ch = new Caterpillar();
		assertTrue("A caterpillar can walk (crawl)..oooo".equals(ch.walk()));
	}
	
}
