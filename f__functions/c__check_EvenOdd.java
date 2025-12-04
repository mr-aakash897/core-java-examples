package f__functions;
import java.util.*;

public class c__check_EvenOdd {

    // function to check if number is even
    public static boolean isEven(int n) {
        return n % 2 == 0; // returns true if even
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        sc.close();
    }
}
