package insects;

import Animal.Animal;
import Animal.movement;

public class Butterfly extends Insects 
{
	public Caterpillar caterpillar_obj;
	
	public Butterfly()
	{
		
		 caterpillar_obj= new Caterpillar();
		 count_canwalk++;
	}
	
	public String fly()
	{
		count_canfly++;
		return "Butterfly can fly";
	}
	
	public String can_sound()
	{
		return "Does not make sound";
	}
	
}
