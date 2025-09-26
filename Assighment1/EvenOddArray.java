package Assighment1;

public class EvenOddArray {

	public static void main(String[] args) {
		int[] arr = {10, 21, 32, 43, 54, 65};
        System.out.print("Even numbers: ");
        for (int n : arr) if (n % 2 == 0) System.out.print(n + " ");
        System.out.print("\nOdd numbers: ");
        for (int n : arr) if (n % 2 != 0) System.out.print(n + " ");
		// TODO Auto-generated method stub

	}

}
