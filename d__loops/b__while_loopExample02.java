package d__loops;
import java.util.*;

// Sum of digits of a number
public class b__while_loopExample02 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // run loop while num is not 0
        while (num != 0) {
            int digit = num % 10;   // get last digit
            sum += digit;           // add digit to sum
            num = num / 10;         // remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
