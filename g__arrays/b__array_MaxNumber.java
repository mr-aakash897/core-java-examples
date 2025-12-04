package g__arrays;
import java.util.*;

public class b__array_MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; // assume first element is max

        // find max
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("maximum number in array is : " + max);

        sc.close();
    }
}
