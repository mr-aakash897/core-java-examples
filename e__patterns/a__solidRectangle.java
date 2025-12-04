package e__patterns;
import java.util.*;

public class a__solidRectangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.println("enter the number for rectangular shape : ");
    int row = sc.nextInt();
    int col = sc.nextInt();
    
    for (int i = 1 ; i<=row ; i++){
        for (int j = 1 ; j<=col ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
}
}
