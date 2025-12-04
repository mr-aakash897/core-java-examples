package e__patterns;
import java.util.*;

public class m__butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows for the butterfly pattern : ");
        int n = sc.nextInt();

        // UPPER PART
        for (int i = 1; i <= n; i++) {

            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces (double spacing for symmetry)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // LOWER PART
        for (int i = n; i >= 1; i--) {

            // left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
