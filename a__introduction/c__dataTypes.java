public class c__dataTypes {
     public static void main(String[] args) {
        
        // 1. Integer Types
        byte smallNumber = 100;          // 1 byte 
        short shortNumber = 30000;       // 2 bytes
        int age = 21;                    // 4 bytes 
        long population = 7800000000L;   // 8 bytes (needs L at end)

        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Int value: " + age);
        System.out.println("Long value: " + population);

        // 2. Floating-point Types
        float pi = 3.14159f;             // 4 bytes, 6–7 decimal digits
        double price = 99.99999999;      // 8 bytes, up to 15 decimal digits

        System.out.println("Float value: " + pi);
        System.out.println("Double value: " + price);

        // 🔹 3. Character Type
        char grade = 'A';                // 2 bytes, stores a single character
        System.out.println("Char value: " + grade);

        // 🔹 4. Boolean Type
        boolean isJavaFun = true;        // 1 bit (true/false)
        boolean isFishFlying = false;
        System.out.println("Boolean true: " + isJavaFun);
        System.out.println("Boolean false: " + isFishFlying);

        // 🔹 5. Non-Primitive Types
        String name = "Aakash";          // String (not a primitive type)
        int[] marks = {90, 80, 70};      // Array
        System.out.println("String: " + name);
        System.out.println("Array element [1]: " + marks[1]);

    }
}