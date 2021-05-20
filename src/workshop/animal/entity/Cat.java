package workshop.animal.entity;

public class Cat extends Animal implements Pet {

	private String name;

//	Define another constructor that takes no parameters. Have this constructor call 
//	the previous constructor (using the this keyword) and pass an empty string as 
//	the argument
	
	//?????
	public Cat() {
		this("");
	}

	public Cat(String name) {
		super(4);
		setName(name);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void play() {
		System.out.println("고양이 걷는다");
	}

	@Override
	public void eat() {
		System.out.println("고양이 먹는다.");
	}

}
