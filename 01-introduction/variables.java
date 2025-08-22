public class variables {
    public static void main (String[] args) {
        
        // 1. Primitive Data types
        int age = 21;                           // integer
        double price = 99 ;                     // decimal value
        char grade = 'A' ;                      // single character
        boolean isJavaFun = true ;              // Boolean (true/false)
        float pi = 3.14f;                       // Float (needs 'f' at the end)
        long bigNumber = 12345678900L ;         // Long (needs 'L')

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Value of pi: " + pi);
        System.out.println("Big Number: " + bigNumber);

         // 2. Non-Primitive Data Types
        String name = "Aakash";       // String (sequence of characters)
        int[] marks = {90, 85, 70};   // Array
        System.out.println("Name: " + name);
        System.out.println("Marks[0]: " + marks[0]);

        // 3. Variable Reassignment
        int score = 50;
        System.out.println("Initial Score: " + score);
        score = 75; // updating value
        System.out.println("Updated Score: " + score);

        // 4. Constants (final keyword)
        final double GRAVITY = 9.8;   // constant (cannot be changed)
        System.out.println("Gravity: " + GRAVITY);

        // Uncommenting the below line will cause an ERROR
        // GRAVITY = 10.0; 
    }
}