package g__arrays;
import java.util.*;

public class e__2D_array_matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take rows and columns
        System.out.println("enter number of rows : ");
        int rows = sc.nextInt();

        System.out.println("enter number of columns : ");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        // input first matrix
        System.out.println("enter elements of first matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // input second matrix
        System.out.println("enter elements of second matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // printing result
        System.out.println("sum of matrices is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
