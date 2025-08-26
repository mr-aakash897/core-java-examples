package c__conditionalStatement;
import java.util.*;

//Assign grades based on marks
public class b__ifElse_IfExample03 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" marks to the student : ");
        int marks = sc.nextInt();  // input marks

        // If marks are 90 or above → Grade A
        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        // If marks are 75–89 → Grade B
        else if (marks >= 75) {
            System.out.println("Grade: B");
        } 
        // If marks are 50–74 → Grade C
        else if (marks >= 50) {
            System.out.println("Grade: C");
        } 
        // If marks are less than 50 → Fail
        else {
            System.out.println("Grade: Fail");
        }
        sc.close();
    }
}
