package e__patterns;
import java.util.*;

public class e__halfPyramid {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the n value for the half pyramid");
    int n = sc.nextInt();
    
    for (int i = 1 ; i<=n ; i++) {
        for ( int j = 1; j<=i ;j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
}
}
