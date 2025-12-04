package h__strings;
import java.util.*;

public class b__string_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string to reverse : ");
        String str = sc.nextLine();

        String rev = "";

        // reverse logic
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("reversed string : " + rev);

        sc.close();
    }
}
