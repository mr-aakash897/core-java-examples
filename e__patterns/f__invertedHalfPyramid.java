package e__patterns;
import java.util.*;

public class f__invertedHalfPyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the n value for the half pyramid");
    int n = sc.nextInt();
    
    for (int i = n ; i>=1 ; i--) {
        for ( int j = 1 ; j<=i ;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
}
}
