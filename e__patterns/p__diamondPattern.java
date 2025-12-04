package e__patterns;
import java.util.*;

public class p__diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows for the diamond pattern : ");
        int n = sc.nextInt();

        // UPPER PART of Diamond
        for (int i = 1; i <= n; i++) {

            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // LOWER PART of Diamond
        for (int i = n - 1; i >= 1; i--) {

            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
