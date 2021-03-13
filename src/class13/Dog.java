package class13;

public class Dog {

	public String breed;
	public String size;
	public String color;
	public int age;
	
	
	public void sleep() {
		System.out.println("ZZZZZzzzzzzz....");
	}
	
	public void bark() {
		System.out.println("wow wow wow");
	}
	public void eat() {

		for(int i=0; i<5;i++) {
			System.out.println("Omnomnom");
		}
	}

	public void look() {
		System.out.println("my color is "+color);
	}
	public static void main(String[] args) {
		
		Dog bullDog= new Dog();
		bullDog.age=5;
		bullDog.breed="American Bulldog";
		bullDog.size="Large";
		bullDog.color="Pink";
		bullDog.bark();
		bullDog.eat();
		bullDog.sleep();
		bullDog.look();
		
		Dog beagle= new Dog();
		beagle.age=8;
		beagle.breed="beagle";
		beagle.size="Large";
		beagle.color="light grey";
		beagle.look();
		
		
	}

}
