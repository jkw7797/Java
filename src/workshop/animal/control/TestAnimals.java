package workshop.animal.control;

import workshop.animal.entity.*;

public class TestAnimals {
	public static void main(String[] args) {
		
		Fish d = new Fish();
		
		Cat c = new Cat("Fluffy");
		Animal c2 = new Cat("Nabi");
		Pet c3 = new Cat("Danbi");
		
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();

		Animal[] list = new Animal[5];
		list[0] =d;
		list[1]	=c;
		list[2]	=a;
		list[3]	=e;
		list[4]	=(Animal)p;
		
		for (Animal animal : list) {
			animal.eat();
			animal.walk();
		}
		
	}
}
