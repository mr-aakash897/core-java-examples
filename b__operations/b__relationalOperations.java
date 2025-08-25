package b__operations;
import java.util.*;;

public class b__relationalOperations {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       System.out.println("enter two input for relational operations : ");
         int x = sc.nextInt(), y = sc.nextInt();

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        sc.close();
     }
}
