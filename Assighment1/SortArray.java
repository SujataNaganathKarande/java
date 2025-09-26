package Assighment1;
import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for (int n : arr) System.out.print(n + " ");
    }
}