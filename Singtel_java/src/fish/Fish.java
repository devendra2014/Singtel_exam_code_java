package fish;

import Animal.Animal;
import Animal.movement;

public class Fish extends Animal implements size, colour
{

	public Dolphin dobj;
	public Fish()
	{
		count_canswim++;
		dobj= new Dolphin();
		
	}
	
	public String swim()
		{
		//	count_canswim++;
			return "Fish can swim";
		}

	@Override
	public String small() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String large() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String orange() {
		// TODO Auto-generated method stub		
		return "";
	}

	@Override
	public String grey() {
		// TODO Auto-generated method stub	
		return "";
	}

	@Override
	public String colourful() {
		// TODO Auto-generated method stub
		return "";
	}

}
