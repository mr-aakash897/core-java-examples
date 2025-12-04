package g__arrays;
import java.util.*;

public class d__2D_array_InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number of rows and columns
        System.out.println("enter number of rows : ");
        int rows = sc.nextInt();

        System.out.println("enter number of columns : ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];   // creating 2D array

        // taking input
        System.out.println("enter " + (rows * cols) + " elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // printing array like a matrix
        System.out.println("2D array is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // next row
        }

        sc.close();
    }
}
