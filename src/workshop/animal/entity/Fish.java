package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish() {
		super(0);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void play() {

	}
	
	@Override
	public void walk() {
		System.out.println("물고기 걷지 못한다.");
	}
	
	
	@Override
	public void eat() {
		System.out.println("물고기 먹는다.");

	}

}
