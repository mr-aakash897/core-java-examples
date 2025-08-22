import java.util.Scanner;

public class e__assignmentOperations {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       System.out.println("enter some number for Assignment operation : ");
          int w = sc.nextInt();

        w += 5;  // w = w + 5
        System.out.println("w += 5: " + w);

        w -= 3;  // w = w - 3
        System.out.println("w -= 3: " + w);

        w *= 2;  // w = w * 2
        System.out.println("w *= 2: " + w);

        w /= 4;  // w = w / 4
        System.out.println("w /= 4: " + w);

        w %= 3;  // w = w % 3
        System.out.println("w %= 3: " + w);

        sc.close();
     }
}
