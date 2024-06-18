//Basic Data types, Variable Types, Modifier Types, Final Keyword, Constructors
/*
 * Data types - byte, short, int, long, float, double, char, boolean
 * Variable Types - Local Variable, Instance Variable, Static
 * Modifiers Types - Access Modifier -> Private, Public, Default, Protected
 * 				   - Non Access Modifier -> static, final, abstract	  
 */
package general;

public class DataTypes {
	
	// Instance variables
    private String name;
    private int age;
    private final String ID; // Final instance variable

    // Static variable
    private static String roleName;

    // Static block to initialize static variables
    static {
        roleName = "Juniour Analyst";
    }

    // Default constructor
    public DataTypes() {
        this.name = "Unknown";
        this.age = 0;
        this.ID = "0000"; // Final variable must be initialized
    }

    // Parameterized constructor
    public DataTypes(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID; // Final variable must be initialized
    }

    // Instance method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + ID);
        System.out.println("Role: " + roleName);
    }

    // Static method
    public static void changeRole(String newRoleName) {
        roleName = newRoleName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects using constructors
    	DataTypes student1 = new DataTypes("Alice", 20, "1234");
    	DataTypes student2 = new DataTypes();

        // Displaying information
        student1.displayInfo();
        student2.displayInfo();

        // Changing static variable
        DataTypes.changeRole("Software Developer");

        // Displaying updated information
        student1.displayInfo();
        student2.displayInfo();
    }

}
