package e__patterns;
import java.util.*;

public class g__180degree_HalfPyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a input for the pyramid : ");
    int n = sc.nextInt();
    
    for(int i = 1 ; i<=n; i++) {
        // to print space 
        for(int j = 1 ; j<=(n-i); j++) {
            System.out.print("  ");
        }
        // to print stars
        for(int j =1 ; j<=i ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
}
}
