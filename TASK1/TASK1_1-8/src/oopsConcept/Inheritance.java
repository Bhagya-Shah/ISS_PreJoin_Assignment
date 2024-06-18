// Inheritance, overriding, polymorphism, abstraction, encapsulation, interfaces, and packages.
package oopsConcept;
//Access Modifier
/*
* Access Modifiers      WithinClass     Within Package      OutsidePackage by Subclass      Outside package
* Private                  Y                 N                         N                          N               
* Default                  Y                 Y                         N                          N
* Protected                Y                 Y                         Y                          N
* Public                   Y                 Y                         Y                          Y
*/
/*4 Pillars of OOPS
	1 Encapsulation 
	2 Inheritance
	3 Polymerphism
	4 Abstraction 
*/
/*
* Encapsulation => It is a wrapping of data(Properties) and methods(Functions) under a single unit. It also implemets data hiding(Uses of access modifire/specifier).
*/
/*
* Inheritance
* Properties and methods of base class is passed on to derive class
* parent,base=>child,derived
*/
/*Polymerphism => Many forms
 * Compile time => Method overloading
       Same name functions and different parameters
       sum(int a,int b)
       sum(int a,int b,int c)
       sum(float a,float b)
       sum(float a,float b,float c)
 * Run time => Method overriding
*/
/*Abstraction*/
/*
* Hiding all the unncessary data and showing only the important parts to the user
* done by Abstract class or Inheritance (Giving idea not the implementation)
* 
* to make any class use abstract keyword
* 1.No object can be made
* 2.Abstract and non abstract methods
* 3.Abstract method can not have a body
* 4.Cannot create object
* 5.Can made constructor
* 
* Interface => blueprint of class
* 1.Multiple inheritance implementation {A,B => C}
* 2.To achieve total abstraction
* 3.All methods are compulsory abstraction
* 4.ALl methods are public,abstract without implementations
* 5.Variables in the interface are final,public and static.
*/


//Interface Worker
interface Worker {
	void work();
}

//Abstract class Person -> Abstraction and Encapsulation
abstract class Person {
	private String name;
	private int age;

	 // Constructor
	 public Person(String name, int age) {
	     this.name = name;
	     this.age = age;
	 }
	
	 // Getter for name
	 public String getName() {
	     return name;
	 }
	
	 // Setter for name
	 public void setName(String name) {
	     this.name = name;
	 }
	
	 // Getter for age
	 public int getAge() {
	     return age;
	 }
	
	 // Setter for age
	 public void setAge(int age) {
	     this.age = age;
	 }
	
	 // Abstract method to be implemented by subclasses
	 public abstract void displayInfo();
}
	
//Employee class demonstrating inheritance and overriding 
class Employee extends Person implements Worker {
	private String department;

	// Constructor
	 public Employee(String name, int age, String department) {
	     super(name, age); // Call the constructor of the superclass Person
	     this.department = department;
	 }
	
	 // Getter for department
	 public String getDepartment() {
	     return department;
	 }
	
	 // Setter for department
	 public void setDepartment(String department) {
	     this.department = department;
	 }

	 // Overriding the abstract method from Person class
	 @Override
	 public void displayInfo() {
	     System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Department: " + department);
	 }

	 // Implementing the method from the Worker interface
	 @Override
	 public void work() {
	     System.out.println(getName() + " is working in the " + department + " department.");
	 }
}

public class Inheritance {
	public static void main(String[] args) {
	     // Instance of Employee
	     Person employee = new Employee("Bhagya", 22, "Junior Analyst - Analytical Verification");
	
	     // Polymorphism
	     employee.displayInfo();
	
	     // Encapsulation
	     employee.setAge(24);
	     employee.displayInfo();
	
	     // Demonstrating interface implementation and polymorphism
	     Worker worker = (Worker) employee;
	     worker.work(); 
	}
}
