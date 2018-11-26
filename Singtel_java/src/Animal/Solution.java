package Animal;


import insects.Butterfly;
import fish.Clownfish;
import fish.Fish;
import fish.Shark;

public class Solution
{

	public static void main(String[] aqrgs)
	{
		/*Duck dobj = new Duck();
		System.out.println(dobj.count_canswim);
		
		Chicken cobj= new Chicken();
		System.out.println(cobj.count_canfly);
		
		//Realtion with rooster
		cobj.robj.rel_with_chicken();
		
		Parrot pobj= new ParrotType();
		pobj.parrotWithCats();
		pobj.parrotWithDogs();
		pobj.parrotWithRooster();
	
	    Fish fobj= new Fish();
	    fobj.dobj.swim();
	    
	    Butterfly bobj= new Butterfly();
	    bobj.caterpillar_obj.walk();*/
		
		
		Bird obj= new Bird();
		Duck obj1= new Duck();
		Chicken obj2= new Chicken();
		Rooster  obj3=new Rooster();
		//Parrot
		Parrot pobj= new ParrotType();
		pobj.parrotWithCats();
		Fish obj4= new Fish();
		Shark obj5= new Shark();
		Clownfish obj6= new Clownfish();
		//dolphin
		//Frog Dog
		Butterfly obj7= new Butterfly();
		
		
		System.out.println(obj.count_canwalk);
		System.out.println(obj.count_canfly);
		System.out.println(obj.count_cansing);
		System.out.println(obj.count_canswim);
		
		
		
		
		
	    
	}	
}
