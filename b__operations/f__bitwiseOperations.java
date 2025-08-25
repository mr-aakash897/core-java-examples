package b__operations;
import java.util.Scanner;

public class f__bitwiseOperations {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       System.out.println("enter two input for Bitwise operations : ");
         int c = sc.nextInt(), d = sc.nextInt();

        System.out.println("c & d = " + (c & d));  // AND
        System.out.println("c | d = " + (c | d));  // OR
        System.out.println("c ^ d = " + (c ^ d));  // XOR
        System.out.println("~c = " + (~c));        // NOT
        System.out.println("c << 1 = " + (c << 1)); // Left shift
        System.out.println("c >> 1 = " + (c >> 1)); // Right shift

        sc.close();
    }
}
