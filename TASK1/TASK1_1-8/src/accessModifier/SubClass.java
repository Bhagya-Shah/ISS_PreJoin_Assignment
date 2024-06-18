package accessModifier;

public class SubClass extends AccessModifiers {
	public void accessProtected() {
		// Accessing protected member in a subclass (same package)
		System.out.println("Accessing Protected Variable in Subclass: " + protectedVar);
		protectedMethod();
	}

	public static void main(String[] args) {
		SubClass demo = new SubClass();
		demo.accessProtected();
	}
}
