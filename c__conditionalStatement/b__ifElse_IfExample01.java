package c__conditionalStatement;
import java.util.*;

// program to check if a number is even,odd or zero
public class b__ifElse_IfExample01 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number : ");
        int num = sc.nextInt();   // you can change the number here

        // First condition: check if number is zero
        if (num == 0) {
            System.out.println("Number is Zero");
        } 
        // Second condition: check if number is divisible by 2 (Even)
        else if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } 
        // Otherwise, it must be Odd
        else {
            System.out.println(num + " is Odd");
        }
        sc.close();
    }
}
