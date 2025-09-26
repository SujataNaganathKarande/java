package Assighment1;
import java.util.Scanner;

public class TotalSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double surfaceArea = 2 * Math.PI * r * (h + r);
        System.out.println("Total Surface Area of Cylinder: " + surfaceArea);
    }
}

