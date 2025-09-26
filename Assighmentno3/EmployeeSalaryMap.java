package Assighmentno3;
import java.util.*;
public class EmployeeSalaryMap {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        HashMap<String, Double> employeeSalaries = new HashMap<>();

	        System.out.print("Enter number of employees: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // consume newline

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter employee name: ");
	            String name = scanner.nextLine();
	            System.out.print("Enter salary for " + name + ": ");
	            double salary = scanner.nextDouble();
	            scanner.nextLine(); // consume newline
	            employeeSalaries.put(name, salary);
	        }

	        System.out.println("\nEmployee Salary Details:");
	        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
	            System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
	        }

	        System.out.print("\nEnter employee name to search: ");
	        String searchName = scanner.nextLine();
	        if (employeeSalaries.containsKey(searchName)) {
	            System.out.println("Salary of " + searchName + ": " + employeeSalaries.get(searchName));
	        } else {
	            System.out.println(searchName + " not found in the records.");
	        }
	    
	}}


