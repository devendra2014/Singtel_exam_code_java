package Animal;

import static org.junit.Assert.*;
import org.junit.Test;

public class RoosterTest {

	public RoosterTest()
		{
			
		}
		
		@Test
		public void can_soundTestPass() {
			Rooster ch = new Rooster();
			assertTrue("Cock-a-doodle-doo".equals(ch.can_sound()));
		}
		
		@Test
		public void can_soundTestFail() {
			Rooster ch = new Rooster();
			assertTrue("Cock-a-doodle-doo...oooo".equals(ch.can_sound()));
		}
		
	
		
}