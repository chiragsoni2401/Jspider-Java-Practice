package pckrtp;

public class TestAnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cat c1 = new Cat();
	Dog d1 = new Dog();
	Snake s1 = new Snake();
	AnimalSimulator an= new AnimalSimulator();
	
			an.makeNoise(s1);
			an.makeNoise(d1);
			an.makeNoise(c1);

	}

}
