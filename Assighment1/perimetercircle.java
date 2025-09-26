package Assighment1;
import java.util.Scanner;
public class perimetercircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter (Circumference) of Circle: " + perimeter);
    }
}

