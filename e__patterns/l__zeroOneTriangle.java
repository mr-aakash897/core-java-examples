package e__patterns;
import java.util.*;

public class l__zeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of rows for 0-1 triangle : ");
        int n = sc.nextInt();

        // loop for rows
        for(int i = 1; i <= n; i++) {

            // loop for columns
            for(int j = 1; j <= i; j++) {

                // if (i+j) is even → print 1, else → print 0
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            // move to next line
            System.out.println();
        }

        sc.close();
    }
}
