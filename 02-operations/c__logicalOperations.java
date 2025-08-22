import java.util.Scanner;

public class c__logicalOperations {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       boolean p = true, q = false;

        System.out.println("Logical operations");
        System.out.println("p && q = " + (p && q));  // AND
        System.out.println("p || q = " + (p || q));  // OR
        System.out.println("!p = " + (!p));          // NOT

        sc.close();
     }
}
