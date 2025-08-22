import java.util.*;

public class solveExample_02 {
    // make a program that takes radius as input , calculate its area and prints its as output to the user
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("give a input for the radius of the circle : ");
        int radius = sc.nextInt();
        final float pi  = 3.14F;
        double area = pi*(radius*radius);

        System.out.println("The area of the given radius of the circle is : "+area);
        sc.close();
    }
}
