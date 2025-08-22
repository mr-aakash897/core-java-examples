import java.util.*;

public class e__inputOutput {
    public static void main(String[] args) {
        
        // 1. Printing Output
        System.out.println("Hello, World!");         // prints with new line
        System.out.print("This is ");                // prints without new line
        System.out.println("Java Input/Output.");    // continues on same line

        // 2. Using Escape Sequences
        System.out.println("Line1\nLine2");          // \n for new line
        System.out.println("Tab\tSpace");            // \t for tab
        System.out.println("Double quote: \"Hello\"");

        // 3. Taking Input using Scanner
        Scanner sc = new Scanner(System.in);

        // String input (single word)
        System.out.print("Enter your name: ");
        String name = sc.next();                        // reads only one word
        System.out.println("Hello " + name);

        // String input (full line)
        sc.nextLine();                                  // consume leftover newline
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();                // reads full line
        System.out.println("Welcome " + fullName);

        // Integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");

        // Double input
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.println("Price entered: " + price);

        // 🔹 4. Formatted Output (like printf in C)
        System.out.printf("My name is %s and I am %d years old.\n", fullName, age);

        sc.close();
    }
}
