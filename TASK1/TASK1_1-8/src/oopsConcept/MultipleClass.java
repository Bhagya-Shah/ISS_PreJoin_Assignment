package oopsConcept;

//Animal Class
class Animal {
	String color;

	void eat() {
		System.out.println("Can eat");
	}

	void breath() {
		System.out.println("can breath");
	}
}

//Fish class extending Animal
class Fish extends Animal {
	int fins;

	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	void swim() {
		System.out.println("can swim");
	}
}

//Type of Fish extending Fish class
class StartFish extends Fish {
	String shape;
}

//Human class extending Animal class 
class Human extends Animal {
	void think() {
		System.out.println("Can think");
	}
}

//Dear animal type class
class Dear extends Animal {
	void eat() {
		System.out.println("Eats grass!");
	}
}

// Function Overloading Example
class Calculator {
	int sum(int a, int b) {
		return a + b;
	}

	float sum(float a, float b) {
		return a + b;
	}

	float sum(float a, float b, float c) {
		return a + b + c;
	}
}

//Abstract class
abstract class Animal2 {
	// constructor of abstract class
	Animal2() {
		System.out.println("Animal Constructor called");
	}

	void eat() {
		System.out.println("Can eat");
	}

	// abstract method
	abstract void walk();
}

class Horse extends Animal2 {
	Horse() {
		System.out.println("Horse constrctor called");
	}

	// implementation of abstract method
	void walk() {
		System.out.println("On 4 legs");
	}
}

//interface
interface ChessPlayer {
	void moves();
}

interface Board {
	void size();
}

//multiple inheritance
class Queen implements ChessPlayer, Board {
	public void size() {
		System.out.println("Have size 8X8");
	}

	public void moves() {
		System.out.println("All move");
	}
}

class Rook implements ChessPlayer {
	public void moves() {
		System.out.println("Right left");
	}
}

class Student {
	String name;
	int roll;
	static String schoolName;

	// getters
	public int getRoll() {
		return roll;
	}

	// setters
	public void setRoll(int roll) {
		this.roll = roll;
	}

	// setter method for name
	void setName(String name) {
		this.name = name;
	}

	// getter method for name
	String getName() {
		return this.name;
	}
}

public class MultipleClass {
	public static void main(String[] args) {
		// object for animal1
		Animal animal1 = new Animal();
		animal1.eat();

		// object for fish and it can have all the methods of animal class too
		Fish fish1 = new Fish();
		fish1.setFins(4);
		System.out.println(fish1.getFins());
		fish1.swim();

		// overloading
		Calculator c1 = new Calculator();
		System.out.println(c1.sum(4, 5));
		System.out.println(c1.sum(4.5F, 5.2F));
		System.out.println(c1.sum(4.5F, 5.2F, 4.2F));

		// overriding
		Dear d1 = new Dear();
		d1.eat();

		// abstraction
		Horse h1 = new Horse();
		h1.walk();
		h1.eat();
		
		//Interface
		Queen q1 = new Queen();
		q1.moves();

	}
}
