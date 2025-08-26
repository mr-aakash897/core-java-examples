package d__loops;
import java.util.*;

// Print numbers from 1 to N
public class a__for_loopExample03 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        // Loop from 1 to N
        for (int i = 1; i <= n; i++) {
            System.out.println(i);  // print i in each iteration
        }

        sc.close();
    }
}
