package d__loops;
import java.util.*;

// Print sum of first N natural numbers
public class a__for_loopExample02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        int sum = 0; // to store the sum

        // Loop from 1 to N and add each number
        for (int i = 1; i <= n; i++) {
            sum += i;  // sum = sum + i
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}
