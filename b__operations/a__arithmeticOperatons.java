package b__operations;
import java.util.Scanner;

public class a__arithmeticOperatons {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("enter the input for arithmetic values :");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division (integer division)
        System.out.println("a % b = " + (a % b));  // Modulus (remainder)
       
        sc.close();
    }
}
