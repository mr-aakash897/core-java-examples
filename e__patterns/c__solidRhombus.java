package e__patterns;
import java.util.*;

public class c__solidRhombus {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("enter the number for rhombus shape : ");
    int n = sc.nextInt();
    
    for (int i = 1 ; i<= n ; i++){
        // to print space
        for (int j = 1 ; j <= (n-i) ; j++) {
            System.out.print("  ");
        }
        // to print stars
        for (int j = 1 ; j<=n ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
}
}
