package packagesExample;

/*Packages in Java
	Packages in java is a group of similar types of classses interfaces and sub-packages
	in-built packages => java.util.*;
*/
import java.util.ArrayList;
import java.util.List;

import general.Employee;

public class PackageExample {
	public static void main(String[] args) {
		// Create a list of employees
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Bhagya", 23, "Analyst", 80000, true));
		employees.add(new Employee("Ariyan", 25, "Engineering", 70000, true));
		employees.add(new Employee("Ankit", 28, "Engineering", 65000, false));
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
