package abstract_class_and_interface;

abstract class Animal{
	public abstract void makeSound();
	
	public void move() {
		System.out.println(getClass().getSimpleName()+ " is moving");
	}
}

class Dog extends Animal{
	public void makeSound() {
		System.out.println("woof...");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("meow...");
	}
}

class Sheep extends Animal{
	public void makeSound() {
		System.out.println("Baaa...");
	}
}

public class Abstract_animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();
		Animal sheep1 = new Sheep();
		
		dog1.makeSound();
		dog1.move();
		
		cat1.makeSound();
		cat1.move();
		
		sheep1.makeSound();
		sheep1.move();

	}

}
