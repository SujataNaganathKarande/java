package Assighmentno3;
import java.util.*;
public class uniquesortedinteger {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        TreeSet<Integer> numbers = new TreeSet<>();

	        System.out.print("Enter the number of integers: ");
	        int n = scanner.nextInt();

	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            numbers.add(scanner.nextInt()); // duplicates automatically ignored
	        }

	        System.out.println("Sorted unique integers: " + numbers);

	        System.out.print("Enter an integer to search: ");
	        int search = scanner.nextInt();
	        if (numbers.contains(search)) {
	            System.out.println(search + " is present in the collection.");
	        } else {
	            System.out.println(search + " is not found.");
	        }
	    
	    }}


