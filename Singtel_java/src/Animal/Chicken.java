package Animal;

public class Chicken extends Bird
{
	//Aggregation
	Rooster robj;
	
	public Chicken()
	{
	
		robj= new Rooster();
		count_cansing++;
	}
	
	public String can_sound()
	{
		System.out.println("Cluck,Cluck");
		//Regional sound
		return "kuklooku";
	}
	
	public String fly()
	{
		System.out.println("A Chicken cannot fly (Assumption its wings are clipped\"\r\n" + 
				"				+ \" but ignore that");
		return "I cannot fly";
		
	}
	
}

