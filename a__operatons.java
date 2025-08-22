import java.util.Scanner;

public class a__operatons {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        // 01. Arithmetic operations
        System.out.println("enter the input for arithmetic values :");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division (integer division)
        System.out.println("a % b = " + (a % b));  // Modulus (remainder)
        System.out.println(" ");                 // space 

        // 02. Relational operations
        System.out.println("enter two input for relational operations : ");
         int x = sc.nextInt(), y = sc.nextInt();

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println(" ");                    // space

        // 03. Logical operatons
         boolean p = true, q = false;

        System.out.println("Logical operations");
        System.out.println("p && q = " + (p && q));  // AND
        System.out.println("p || q = " + (p || q));  // OR
        System.out.println("!p = " + (!p));          // NOT
        System.out.println("  ");                  // space

        // 04 Unary operations
        System.out.println("enter some number for unary operation : ");
         int num = sc.nextInt();

        System.out.println("Original num: " + num);
        System.out.println("Post-increment: " + (num++)); // uses then increments
        System.out.println("After post-increment: " + num);
        System.out.println("Pre-increment: " + (++num)); // increments then uses
        System.out.println("Post-decrement: " + (num--));
        System.out.println("Pre-decrement: " + (--num));
        System.out.println("  ");                      // space

        // 05. Assignment operations
         System.out.println("enter some number for Assignment operation : ");
          int w = sc.nextInt();

        w += 5;  // w = w + 5
        System.out.println("w += 5: " + w);

        w -= 3;  // w = w - 3
        System.out.println("w -= 3: " + w);

        w *= 2;  // w = w * 2
        System.out.println("w *= 2: " + w);

        w /= 4;  // w = w / 4
        System.out.println("w /= 4: " + w);

        w %= 3;  // w = w % 3
        System.out.println("w %= 3: " + w);
        System.out.println("  ");

        // 06. Bitwise operations
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
