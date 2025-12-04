package h__strings;
import java.util.*;

public class c__string_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string : ");
        String str = sc.nextLine();

        int count = 0;

        // converting to lowercase to simplify checking
        str = str.toLowerCase();

        // counting vowels
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // vowels: a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("number of vowels : " + count);

        sc.close();
    }
}
