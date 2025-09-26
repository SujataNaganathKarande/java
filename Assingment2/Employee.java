package Assingment2;
import java.util.Scanner;

public class Employee {
	

	
	    protected int id;
	    protected String name;
	    protected double salary;

	    public Employee() {
	        id = 0;
	        name = "";
	        salary = 0.0;
	    }

	    public void accept(Scanner sc) {
	        System.out.print("Enter id: ");
	        id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter name: ");
	        name = sc.nextLine();
	        System.out.print("Enter salary: ");
	        salary = sc.nextDouble();
	    }

	    public void display() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	    }
	}

	class Manager extends Employee {
	    private double bonus;

	    public Manager() {
	        super();
	        bonus = 0.0;
	    }

	    public void accept(Scanner sc) {
	        super.accept(sc);
	        System.out.print("Enter bonus: ");
	        bonus = sc.nextDouble();
	    }

	    public double totalSalary() {
	        return salary + bonus;
	    }

	    public void display() {
	        super.display();
	        System.out.println("Bonus: " + bonus + ", Total Salary: " + totalSalary());
	    }
	}

	   class ManagerTest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of managers: ");
	        int n = sc.nextInt();

	        Manager[] managers = new Manager[n];
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter details for Manager " + (i + 1));
	            managers[i] = new Manager();
	            managers[i].accept(sc);
	        }

	        // Find manager with max total salary
	        Manager maxManager = managers[0];
	        for (int i = 1; i < n; i++) {
	            if (managers[i].totalSalary() > maxManager.totalSalary()) {
	                maxManager = managers[i];
	            }
	        }

	        System.out.println("Manager with maximum total salary:");
	        maxManager.display();

	        sc.close();
	    }
	}



