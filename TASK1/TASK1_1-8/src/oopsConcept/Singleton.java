package oopsConcept;

class ExampleSingleton {
	private static ExampleSingleton instance = null;

	private ExampleSingleton() {}

	public static ExampleSingleton getInstance() {
		if (instance == null) {
			instance = new ExampleSingleton();
		}
		return instance;
	} 

	protected void method() {
		System.out.println("Singleton instance method");
	}
}

public class Singleton {

	public static void main(String[] args) {
		ExampleSingleton tmp = ExampleSingleton.getInstance();
		tmp.method();
	}
}
