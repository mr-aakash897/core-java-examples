package A__introduction;
import java.util.*;

public class solveExample_01 {
     //Take two variables a and b and print their sums
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input for a variable : ");
        int a = sc.nextInt();
         System.out.println("enter the input for b variable : ");
        int b = sc.nextInt();

        System.out.println("the sum of two variables a and b is : "+(a+b));
        sc.close();
    }
}
