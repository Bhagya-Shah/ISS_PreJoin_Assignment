package collection;

public class Student implements Comparable<Student> {

	private int ID;
	private String name;

	public Student(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student { ID = " + ID + ", Name = '" + name + "' }";
	}

	@Override
	public int compareTo(Student other) {
		return this.ID - other.ID;
	}
}
