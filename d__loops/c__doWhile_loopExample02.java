package d__loops;
import java.util.*;

// Keep asking for input until user enters 0
public class c__doWhile_loopExample02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        // loop will run at least once
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();

            if (num != 0) {
                System.out.println("You entered: " + num);
            }

        } while (num != 0);  // stop when user enters 0

        System.out.println("Program ended.");
        sc.close();
    }
}
