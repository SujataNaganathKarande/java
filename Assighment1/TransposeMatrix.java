package Assighment1;
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpose = new int[3][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transposed matrix:");
        for (int[] row : transpose) {
            for (int n : row) System.out.print(n + " ");
            System.out.println();
        }
    }
}



