package Animal;

import static org.junit.Assert.*;
import org.junit.Test;
public class BirdTest  {
	
	
	public BirdTest()
	{	
	}
	
	@Test
	public void flyTestPass() {
		Bird bird = new Bird();
		assertTrue("I am flying".equals(bird.fly()));
	}
	
	@Test
	public void flyTestFail() {
		Bird bird = new Bird();
		assertTrue("I am flying ...".equals(bird.fly()));
	}

	@Test
	public void walkTestPass() {
		Bird bird = new Bird();
		assertTrue("I am walking".equals(bird.walk()));
	}
	
	@Test
	public void walkTestFail() {
		Bird bird = new Bird();
		assertTrue("I am walking ...".equals(bird.walk()));
	}

	@Test
	public void singTestPass() {
		Bird bird = new Bird();
		assertTrue("I am singing".equals(bird.sing()));
	}
	
	@Test
	public void singTestFail() {
		Bird bird = new Bird();
		assertTrue("I am singing zzz".equals(bird.sing()));
	}
}
