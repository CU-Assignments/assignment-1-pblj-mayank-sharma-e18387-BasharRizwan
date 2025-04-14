import java.util.Scanner;
public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        int[][] add = new int[2][2];
        int[][] sub = new int[2][2];
        int[][] mul = new int[2][2];

        System.out.println("Enter elements of Matrix 1 (2x2): ");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                mat1[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix 2 (2x2): ");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                mat2[i][j] = sc.nextInt();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                add[i][j] = mat1[i][j] + mat2[i][j];
                sub[i][j] = mat1[i][j] - mat2[i][j];
            }

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    mul[i][j] += mat1[i][k] * mat2[k][j];

        System.out.print("Addition: ");
        printMatrix(add);
        System.out.print("Subtraction: ");
        printMatrix(sub);
        System.out.print("Multiplication: ");
        printMatrix(mul);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix)
            for (int val : row)
                System.out.print(val + " ");
        System.out.println();
    }
}
