package Assighment1;
import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter side: ");
        double side = sc.nextDouble();
        double perimeter = 2 * (base + side);
        System.out.println("Perimeter of Parallelogram: " + perimeter);
    }
}

