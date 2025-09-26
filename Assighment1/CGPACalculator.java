package Assighment1;
import java.util.Scanner;
public class CGPACalculator {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int subjects;
	        double total = 0.0;

	        System.out.print("Enter number of subjects: ");
	        subjects = sc.nextInt();

	        for (int i = 1; i <= subjects; i++) {
	            System.out.print("Enter grade point for subject " + i + ": ");
	            double grade = sc.nextDouble();
	            total += grade;
	        }
	        double cgpa = total / subjects;
	        System.out.println("CGPA = " + cgpa);

	        sc.close();
	    }
	
}
