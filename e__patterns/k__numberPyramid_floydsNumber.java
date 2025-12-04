package e__patterns;
import java.util.*;

public class k__numberPyramid_floydsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows for Floyd's Triangle : ");
        int n = sc.nextInt();

        int num = 1; // starting number

        // loop for rows
        for(int i = 1; i <= n; i++) {

            // print numbers in each row
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;  // increase number continuously
            }

            // move to next line
            System.out.println();
        }

        sc.close();
    }
}
