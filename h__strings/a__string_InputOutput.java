package h__strings;
import java.util.*;

public class a__string_InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string : ");
        String str = sc.nextLine(); // taking full line input

        System.out.println("characters in the string : ");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)); // printing each character
        }

        sc.close();
    }
}
