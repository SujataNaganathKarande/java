package Assighment1;
import java.util.Scanner;

public class Valuecone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double volume = (Math.PI * r * r * h) / 3;
        System.out.println("Volume of Cone: " + volume);
    }
}

