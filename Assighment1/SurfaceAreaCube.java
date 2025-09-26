package Assighment1;
import java.util.Scanner;

public class SurfaceAreaCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        double side = sc.nextDouble();
        double surfaceArea = 4 * side * side; // Curved area (only 4 sides)
        System.out.println("Curved Surface Area of Cube: " + surfaceArea);
    }
}

