package Basics;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit typecasting (Widening Conversion)
        int intVar = 67;
        long longVar = intVar;  // int to long automatically converted
        float floatVar = longVar; // long to float automatically converted

        System.out.println("Int: " + intVar);
        System.out.println("Long (after implicit casting): " + longVar);
        System.out.println("Float (after implicit casting): " + floatVar);

        // Explicit typecasting (Narrowing Conversion)
        double doubleVar = 199.99;
        long longvar = (long) doubleVar; // double to long
        int intvar = (int) longvar; // long to int

        System.out.println("Double: " + doubleVar);
        System.out.println("Long (after explicit casting): " + longvar);
        System.out.println("Int (after explicit casting): " + intvar);
    }
}
