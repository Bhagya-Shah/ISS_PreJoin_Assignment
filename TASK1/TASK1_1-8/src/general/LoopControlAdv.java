package general;
import java.util.ArrayList;
import java.util.List;
//import general.Employee;
public class LoopControlAdv {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bhagya", 23, "Analyst", 80000, true));
        employees.add(new Employee("Ariyan", 25, "Engineering", 70000, true));
        employees.add(new Employee("Ankit", 28, "Engineering", 65000, false));
        employees.add(new Employee("Bhavya", 38, "HR", 60000, true));
        employees.add(new Employee("Aditya", 40, "Management", 90000, true));

        // 1. Find and print the highest salary in the company
        double highestSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > highestSalary) {
                highestSalary = employee.getSalary();
            }
        }
        System.out.println("Highest salary in the company: " + highestSalary);

        // 2. Print details of all active employees in the Engineering department
        System.out.println("Active employees in Engineering department:");
        for (Employee employee : employees) {
            if (employee.isActive() && "Engineering".equals(employee.getDepartment())) {
                System.out.println(employee);
            }
        }

        // 3. Deactivate all employees older than 35
        for (Employee employee : employees) {
            if (employee.getAge() > 35) {
                employee.setActive(false);
            }
        }

        // 4. Nested loop: Department-wise employee count
        String[] departments = {"HR", "Engineering", "Management", "Analyst"};
        for (String department : departments) {
            int count = 0;
            for (Employee employee : employees) {
                if (department.equals(employee.getDepartment())) {
                    count++;
                }
            }
            System.out.println("Number of employees in " + department + " department: " + count);
        }

        // 5. Handle potential null values in employee list
        employees.add(null); // Adding a null employee for demonstration
        for (Employee employee : employees) {
            if (employee == null) {
                System.out.println("Null employee.");
                continue;
            }
            System.out.println("Processing employee: " + employee.getName());
        }
    }
}


