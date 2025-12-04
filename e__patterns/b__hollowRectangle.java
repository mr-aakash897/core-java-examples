package e__patterns;
import java.util.*;

public class b__hollowRectangle {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the no. of row of the rectangle :");
    int row = sc.nextInt();
    System.out.println("Enter the no. of col of the rectangle :");
    int col = sc.nextInt();
    
    for( int i = 1 ; i <= row ; i++) {
        for(int j = 1 ; j <= col ; j++) {
            if (i == 1 || i == row || j == 1 || j == col) {        //condition to print hollow rectangle which is print * if number is on the 1 position aur the last 
                System.out.print("* ");
            }else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    sc.close();
}
}
