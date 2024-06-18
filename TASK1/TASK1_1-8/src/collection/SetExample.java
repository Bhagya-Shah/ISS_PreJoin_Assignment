package collection;
/*
 * A Set is a Collection that cannot contain duplicate elements. 
 * Three implementations of Set interface: 
 		HashSet -> does not maintain the insertion order
 		TreeSet -> Maintain the insertion order 
 		LinkedHashSet -> Maintains order and uses address to connect 
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class SetExample {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(3, "Ankit"));
        studentSet.add(new Student(1, "Bhagya"));
        studentSet.add(new Student(2, "Disha"));

        System.out.println("Original Set:");
        studentSet.forEach(System.out::println);

        // Adding a new student
        studentSet.add(new Student(4, "Arihant"));
        System.out.println("\nSet after adding a new student:");
        studentSet.forEach(System.out::println);
        
        // Removing a student by ID
        studentSet.removeIf(student -> student.getID() == 3);
        System.out.println("\nSet after removing student with ID 3:");
        studentSet.forEach(System.out::println);
        
        // Checking if a student is in the set
        boolean exists = studentSet.contains(new Student(1, "Neel"));
        System.out.println("\nIs student 1- Neel exists? " + exists);
        
        // TreeSet -> Directly sort with ID
        Set<Student> sortedByID = new TreeSet<>(studentSet);
        System.out.println("\nSet sorted by ID (Comparable):");
        sortedByID.forEach(System.out::println);

        // TreeSet with custom Comparator (by Name)
        Set<Student> sortedByName = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        sortedByName.addAll(studentSet);
        System.out.println("\nSet sorted by Name (Comparator):");
        sortedByName.forEach(System.out::println);

    }
}

