//Basics of Java: Concept of Class, Object, State (instance variable), and Methods (behavior)

package general;

//Class
class Car {
	 // State (instance variables)
	 private String color;
	 private String model;
	 private int year;

	 // Constructor
	 public Car(String color, String model, int year) {
	     this.color = color;
	     this.model = model;
	     this.year = year;
	 }
	//Method 1
	 public void drive() {
	     System.out.println("The car is being driven.");
	 }
	
	 //Method 2
	 public void displayDetails() {
	     System.out.println("Color: " + color);
	     System.out.println("Model: " + model);
	     System.out.println("Year: " + year);
	 }
}
public class BasicOfJava {
	public static void main(String [] args) {
		System.out.println("Hello ISS");
	     // Creating an object of the Car class
	     Car myCar = new Car("White", "Ferrari", 2024);
	     myCar.displayDetails();
	     myCar.drive();
 	}
}