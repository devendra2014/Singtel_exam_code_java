package Animal;

public class Bird extends Animal implements movement
{		
	public Bird()
	{
		count_canfly++;
		count_cansing++;
		count_canwalk++;
	}
	
	
	public String swim()
	{		
		return"";
	}
	
	public String fly() 
	{	
		return "I am flying";
	}

	public String walk() 
	{		
		return "I am walking";
	}		

	public String sing() 
	{		
		return "I am singing";
	}	
}
