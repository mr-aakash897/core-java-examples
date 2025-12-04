package f__functions;
import java.util.*;

public class b__maxOfTwo {
    
    // function to return the greater number
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int bigger = max(x, y);   // calling function

        System.out.println("The larger number is: " + bigger);

        sc.close();
    }
}
