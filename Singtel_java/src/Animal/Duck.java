package Animal;

public class Duck extends Bird
{
	public Duck()
	{
		count_canswim++;

	}
	
	public String can_sound()
	{
		
		System.out.println("Quack,quack");
		//regional
		return "Quack,quack";
	}
	
	public String swim()
	{
		
		return "A duck can swim";
	}
	
}
