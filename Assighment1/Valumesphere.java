package Assighment1;
import java.util.Scanner;

public class Valumesphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double volume = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        System.out.println("Volume of Sphere: " + volume);
    }
}

