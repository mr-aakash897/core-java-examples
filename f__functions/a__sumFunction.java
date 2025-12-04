package f__functions;
import java.util.*;

public class a__sumFunction {
    
     // function to return sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = sum(x, y);  // calling function

        System.out.println("Sum is: " + result);

        sc.close();
    }
}
