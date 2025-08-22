import java.util.Scanner;

public class d__unaryOperations {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       System.out.println("enter some number for unary operation : ");
         int num = sc.nextInt();

        System.out.println("Original num: " + num);
        System.out.println("Post-increment: " + (num++)); // uses then increments
        System.out.println("After post-increment: " + num);
        System.out.println("Pre-increment: " + (++num)); // increments then uses
        System.out.println("Post-decrement: " + (num--));
        System.out.println("Pre-decrement: " + (--num));

        sc.close();
     }
}
