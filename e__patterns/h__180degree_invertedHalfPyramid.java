package e__patterns;
import java.util.*;

public class h__180degree_invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a input for the inverted pyramid : ");
        int n = sc.nextInt();

        // loop for number of rows (starting from n down to 1)
        for(int i = n; i >= 1; i--) {

            // to print spaces before stars
            // spaces increase as rows decrease
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            // to print stars
            // stars decrease each row
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }

        sc.close();
    }
}
