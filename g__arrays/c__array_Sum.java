package g__arrays;
import java.util.*;

public class c__array_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter " + n + " numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // calculate sum
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("sum of all numbers is : " + sum);

        sc.close();
    }
}
