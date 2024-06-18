package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class MapExample {
	public static void main(String[] args) {
		Map<Student, Student> studentMap = new HashMap<>();
		studentMap.put(new Student(3, "Mahek"), new Student(3, "Mahek"));
		studentMap.put(new Student(1, "Tisha"), new Student(1, "Tisha"));
		studentMap.put(new Student(2, "Bhagya"), new Student(2, "Bhagya"));

		System.out.println("Original Map:");
		studentMap.forEach((key, value) -> System.out.println(key + " => " + value));

		// TreeMap sorted
		Map<Student, Student> sortedByID = new TreeMap<>(studentMap);
		System.out.println("\nMap sorted by ID (Comparable):");
		sortedByID.forEach((key, value) -> System.out.println(key + " => " + value));

		// Sorting by Name -> Comparator (by Name)
		Map<Student, Student> sortedByName = new TreeMap<>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		sortedByName.putAll(studentMap);
		System.out.println("\nMap sorted by Name (Comparator):");
		sortedByName.forEach((key, value) -> System.out.println(key + " => " + value));

		// Adding a new student
		studentMap.put(new Student(4, "Ayush"), new Student(4, "Ayush"));
		System.out.println("\nMap after adding a new student:");
		studentMap.forEach((key, value) -> System.out.println(key + " => " + value));

		// Removing a student by ID
		studentMap.keySet().removeIf(student -> student.getID() == 3);
		System.out.println("\nMap after removing student with ID 3:");
		studentMap.forEach((key, value) -> System.out.println(key + " => " + value));

	}
}
