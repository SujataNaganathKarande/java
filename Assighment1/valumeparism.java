package Assighment1;
import java.util.Scanner;

public class valumeparism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double volume = l * w * h;
        System.out.println("Volume of Prism: " + volume);
    }
}

