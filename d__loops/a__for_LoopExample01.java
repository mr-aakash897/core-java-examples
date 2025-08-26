package d__loops;
import java.util.*;

// Print the multiplication table of a number
public class a__for_LoopExample01 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
