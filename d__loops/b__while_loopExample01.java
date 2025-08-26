package d__loops;
import java.util.*;

// Multiplication Table
public class b__while_loopExample01 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;

        // print table while i <= 10
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        sc.close();
    }
}
