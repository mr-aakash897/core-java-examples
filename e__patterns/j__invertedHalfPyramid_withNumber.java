package e__patterns;
import java.util.*;

public class j__invertedHalfPyramid_withNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a input for the inverted number pyramid : ");
        int n = sc.nextInt();

        // loop for rows (starting from n down to 1)
        for(int i = n; i >= 1; i--) {

            // to print numbers from 1 to i
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // move to next line
            System.out.println();
        }

        sc.close();
    }
}
