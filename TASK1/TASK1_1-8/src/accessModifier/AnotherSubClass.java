package accessModifier;

public class AnotherSubClass {
	public void accessData() {
		AccessModifiers demo = new AccessModifiers();
		// Accessing members from another class in the same package
		System.out.println("Accessing Public Variable: " + demo.publicVar);
		System.out.println("Accessing Default Variable: " + demo.defaultVar);
		System.out.println("Accessing Protected Variable: " + demo.protectedVar);
		demo.publicMethod();
		demo.defaultMethod();
		demo.protectedMethod();
//	    Cannot access private members
//	    System.out.println("Accessing Private Variable: " + demo.privateVar); // Error
//	    demo.privateMethod(); // Error
	}

	public static void main(String[] args) {
		AnotherSubClass anotherClass = new AnotherSubClass();
		anotherClass.accessData();
	}
}
