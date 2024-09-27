package Basics;

public class Datatypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 567;
        long longVar = 10000000000L;
        float floatVar = 10.5f;
        double doubleVar = 69.99;
        char charVar = 'A';
        boolean booleanVar = true;

        // Printing values
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);

        // Reference Data Types
        String stringVar = "Hello, Java!";
        int[] intArray = {1, 2, 3, 4};

        System.out.println("String: " + stringVar);
        System.out.println("Array Element 1: " + intArray[0]);
    }
}
