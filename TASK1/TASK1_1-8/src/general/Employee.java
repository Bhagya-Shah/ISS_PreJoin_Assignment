package general;

//Employee class definition
public class Employee {
	private String name;
	private int age;
	private String department;
	private double salary;
	private boolean active;

	// Constructor
	public Employee(String name, int age, String department, double salary, boolean active) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.active = active;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public boolean isActive() {
		return active;
	}

	// Setters
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Employee { " + "name = '" + name + '\'' + ", age = " + age + ", department = '" + department + '\''
				+ ", salary = " + salary + ", active = " + active + " }";
	}
}
