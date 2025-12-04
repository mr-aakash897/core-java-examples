package e__patterns;
import java.util.*;

public class o__palindromeNumber_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows for the palindrome number pyramid : ");
        int n = sc.nextInt();

        // loop for rows
        for (int i = 1; i <= n; i++) {

            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // print decreasing numbers (i down to 1)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // print increasing numbers (2 to i)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // move to the next line
            System.out.println();
        }

        sc.close();
    }
}
