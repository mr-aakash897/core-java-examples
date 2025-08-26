package c__conditionalStatement;

// program to check which number is largest 
public class b__ifElse_IfExample02 {
      public static void main(String[] args) {
        int a = 15, b = 25, c = 20;  // three numbers

        // Check if 'a' is the largest
        if (a >= b && a >= c) {
            System.out.println("Largest is: " + a);
        } 
        // Else check if 'b' is the largest
        else if (b >= a && b >= c) {
            System.out.println("Largest is: " + b);
        } 
        // Otherwise, 'c' must be the largest
        else {
            System.out.println("Largest is: " + c);
        }
    }
}
