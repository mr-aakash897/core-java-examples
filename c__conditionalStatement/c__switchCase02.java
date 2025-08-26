package c__conditionalStatement;
import java.util.*;

// Calculator
public class c__switchCase02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two input to calculate : ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("select the operation : ");
        char operator = sc.next().charAt(0);   // take single character input

        switch (operator) {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;
            case '-':
                System.out.println("Difference = " + (a - b));
                break;
            case '*':
                System.out.println("Product = " + (a * b));
                break;
            case '/':
                System.out.println("Quotient = " + (a / b));
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
