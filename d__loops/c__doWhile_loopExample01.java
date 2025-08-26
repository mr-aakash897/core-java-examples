package d__loops;
import java.util.*;

//Multiplication Table
public class c__doWhile_loopExample01 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;

        // print multiplication table
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);

        sc.close();
    }
}
