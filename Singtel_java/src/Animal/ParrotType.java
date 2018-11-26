package Animal;

public class ParrotType extends Animal implements Parrot{

	@Override
	public String parrotWithDogs() {
		// TODO Auto-generated method stub
		count_canfly++;
		count_cansing++;
		System.out.println("Woof, woof");
		//regional
		return"Woof, woof";
	}

	@Override
	public String parrotWithCats() {
		// TODO Auto-generated method stub
		count_canfly++;
		count_cansing++;
	//	System.out.println("Meow");
		//regional
		return"Meooow,Meooow";
	}

	@Override
	public String parrotWithRooster() {
		// TODO Auto-generated method stub
		count_canfly++;
		count_cansing++;
		System.out.println("Cock-a-doodle-doo");
		//regional
		return"Cock-a-doodle-doo";
	}

/*	@Override
	public void parrotwithDuck() {
		// TODO Auto-generated method stub
		System.out.println("Quack, Quack");
	}

	@Override
	public void parrotnearPhone() {
		// TODO Auto-generated method stub
		System.out.println("Ring,ring");
	}
*/

}