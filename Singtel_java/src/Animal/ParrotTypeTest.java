package Animal;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParrotTypeTest {


	public ParrotTypeTest()
	{
		
	}
	
	@Test
	public void parrotWithDogsTestPass() {
		ParrotType ch = new ParrotType();
		assertTrue("Woof, woof".equals(ch.parrotWithDogs()));
	}
	
	@Test
	public void parrotWithDogsTestFail() {
		ParrotType ch = new ParrotType();
		assertTrue("Woof, woof...oooo".equals(ch.parrotWithDogs()));
	}
	
	
	@Test
	public void parrotWithCatsTestPass() {
		ParrotType ch = new ParrotType();
		assertTrue("Meooow,Meooow".equals(ch.parrotWithCats()));
	}
	
	@Test
	public void parrotWithCatsTestFail() {
		ParrotType ch = new ParrotType();
		assertTrue("Meooow,Meooow...oooo".equals(ch.parrotWithCats()));
	}
	
	@Test
	public void parrotWithRoosterTestPass() {
		ParrotType ch = new ParrotType();
		assertTrue("Cock-a-doodle-doo".equals(ch.parrotWithRooster()));
	}
	
	@Test
	public void parrotWithRoosterTestFail() {
		ParrotType ch = new ParrotType();
		assertTrue("Cock-a-doodle-doo...oooo".equals(ch.parrotWithRooster()));
	}
	

}
