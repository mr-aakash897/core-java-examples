package e__patterns;
import java.util.*;

public class d__hollowRhombus {
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
            // condition to print stars
            if (i==1 || i==n || j==1 || j==n) {
                System.out.print("* ");
            }else {
                System.out.print("  ");        // to print the hollow part of rhombus
            }
        }
        System.out.println();
    }
    sc.close();
}
}
