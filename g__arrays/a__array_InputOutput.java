package g__arrays;
import java.util.*;

public class a__array_InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];   // creating array

        // taking input
        System.out.println("enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // printing array
        System.out.println("array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
