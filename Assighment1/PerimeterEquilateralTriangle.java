package Assighment1;
import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        double side = sc.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle: " + perimeter);
    }
}

