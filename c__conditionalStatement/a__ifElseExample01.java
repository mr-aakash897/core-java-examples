package c__conditionalStatement;
import java.util.*;

// program to check if the person is eligible to vote or note based on age
public class a__ifElseExample01 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of the person : ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}
