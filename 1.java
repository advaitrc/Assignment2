import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
    String empId;
    String name;
    int age;
    int salary;

    public Employee(String empId, String name, int age, int salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class EmployeeTable {
    List<Employee> employees;

    public EmployeeTable(List<Employee> employees) {
        this.employees = employees;
    }

    public void displayTable() {
        System.out.println("Employee ID   Name    Age   Salary");
        for (Employee emp : employees) {
            System.out.println(emp.empId + "   " + emp.name + "   " + emp.age + "   " + emp.salary);
        }
    }

    public void sortTable(int sortingParameter) {
        switch (sortingParameter) {
            case 1:
                Collections.sort(employees, Comparator.comparingInt(emp -> emp.age));
                break;
            case 2:
                Collections.sort(employees, Comparator.comparing(emp -> emp.name));
                break;
            case 3:
                Collections.sort(employees, Comparator.comparingInt(emp -> emp.salary));
                break;
            default:
                System.out.println("Invalid sorting parameter. Please choose 1, 2, or 3.");
        }
    }
}

public class EmployeeTableApp {
    public static void main(String[] args) {
        // Sample data
        List<Employee> employeesData = new ArrayList<>();
        employeesData.add(new Employee("161E90", "Ramu", 35, 59000));
        employeesData.add(new Employee("171E22", "Tejas", 30, 82100));
        employeesData.add(new Employee("171G55", "Abhi", 25, 100000));
        employeesData.add(new Employee("152K46", "Jaya", 32, 85000));

        // Creating EmployeeTable object
        EmployeeTable employeeTable = new EmployeeTable(employeesData);

        // Displaying original table
        System.out.println("Original Employee Table:");
        employeeTable.displayTable();

        // User input for sorting parameter
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter sorting parameter (1. Age, 2. Name, 3. Salary): ");
        int sortingParam = scanner.nextInt();

        // Sorting and displaying the table
        employeeTable.sortTable(sortingParam);
        System.out.println("\nSorted Employee Table:");
        employeeTable.displayTable();
    }
}
