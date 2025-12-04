package e__patterns;
import java.util.*;

public class n__numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows for the full number pyramid : ");
        int n = sc.nextInt();

        // loop for rows
        for (int i = 1; i <= n; i++) {

            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // decreasing numbers
            num -= 2; // adjust to print backwards
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }

            // move to next line
            System.out.println();
        }

        sc.close();
    }
}
