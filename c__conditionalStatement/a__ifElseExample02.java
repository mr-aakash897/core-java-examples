package c__conditionalStatement;
import java.util.*;

// program to check if the number is even to odd
public class a__ifElseExample02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        int num = sc.nextInt();   // change the number to test

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        sc.close();
    }
}
