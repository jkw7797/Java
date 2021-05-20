package oop.flexible;

public class TestPolymorphism {
	public static void main(String[] args) {
//		Dog d1, d2;
//		Animal a1, a2;
//		a1 = new Animal();
//		d1 = new Dog();
//
//		a2 = d1; // Animal a2 = new Dog(); (o)
//		d2 = (Dog) a2; // Dog d2 = (Dog)new Animal();
//		a1.eat();
//		a2.eat();
//		d2.eat();
		
		Animal animal = new Animal("동물이름");
		System.out.println(animal);
		
	}
}

class Animal extends Object {
	String name;
	public Animal(String name) {
		setName(name);
		System.out.println("Animal");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	public void eat() {
		System.out.println("Animal eat someting");
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Dog");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eat Someting");
		
	}
	
}

class Cat extends Animal {
	public Cat() {
		System.out.println("Cat");
	}
}