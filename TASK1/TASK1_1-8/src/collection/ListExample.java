package collection;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

/*
 * Class that implements List Interface
	ArrayList
	LinkedList -> Address is also stored
	Vector -> Synchronized -> add,remove
	Stack -> LIFO architecture -> pop,push
 */


public class ListExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Aman"));
        students.add(new Student(1, "Bhagya"));
        students.add(new Student(2, "Chaitya"));

        System.out.println("Original List:");
        students.forEach(System.out::println);

        // Updating a student's name
        students.get(0).setName("Alex");
        System.out.println("\nList after updating name:");
        students.forEach(System.out::println);
        
        // Removing a students
        students.removeIf(student -> student.getID() == 2);
        System.out.println("\nList after removing student with ID 2:");
        students.forEach(System.out::println);
        
        // Sorting using Comparable (by ID)
        Collections.sort(students);
        System.out.println("\nList sorted by ID (Comparable):");
        students.forEach(System.out::println);

        // Sorting using Comparator (by Name)
        System.out.println("\nList sorted by Name (Comparator):");
        Collections.sort(students,(s1,s2)->s1.getName().compareTo(s2.getName()));
        //students.sort(Comparator.comparing(Student::getName));
        //using different class can also be implemented
        students.forEach(System.out::println);

    }
}

