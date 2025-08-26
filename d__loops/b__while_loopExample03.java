package d__loops;
import java.util.*;

// Print numbers from 1 to N
public class b__while_loopExample03 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        int i = 1; // initialization

        // loop will run while i <= n
        while (i <= n) {
            System.out.println(i);
            i++; // increment
        }

        sc.close();
    }
}
