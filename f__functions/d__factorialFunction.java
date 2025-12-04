package f__functions;
import java.util.*;

public class d__factorialFunction {

    // function to calculate factorial of a number
    public static long factorial(int n) {

        long fact = 1;

        // multiply 1 * 2 * 3 * ... * n
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact; // returning the factorial result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        long result = factorial(num);  // calling function

        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }
}
