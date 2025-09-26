package Assighment1;
import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("How many numbers? ");
	        int count = scanner.nextInt();
	        
	        double sum = 0;
	        for (int i = 1; i <= count; i++) {
	            System.out.print("Enter number " + i + ": ");
	            double num = scanner.nextDouble();
	            sum += num;
	        }
		// TODO Auto-generated method stub

	}

}
