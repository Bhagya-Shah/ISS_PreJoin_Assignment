package accessModifier;

public class AccessModifiers {

	// public variable
	public String publicVar = "I am public";

	// private variable
	private String privateVar = "I am private";

	// protected variable
	protected String protectedVar = "I am protected";

	// default variable
	String defaultVar = "I am default";

	// public method
	public void publicMethod() {
		System.out.println("Public Method: " + publicVar);
	}

	// private method
	private void privateMethod() {
		System.out.println("Private Method: " + privateVar);
	}

	// protected method
	protected void protectedMethod() {
		System.out.println("Protected Method: " + protectedVar);
	}

	// default method
	void defaultMethod() {
		System.out.println("Default Method: " + defaultVar);
	}

	// Method to access private members within the class
	public void accessPrivate() {
		privateMethod();
		System.out.println("Accessing Private Variable: " + privateVar);
	}

	public static void main(String[] args) {
		AccessModifiers demo = new AccessModifiers();
		demo.publicMethod();
		demo.accessPrivate();
		demo.protectedMethod();
		demo.defaultMethod();
	}

}
