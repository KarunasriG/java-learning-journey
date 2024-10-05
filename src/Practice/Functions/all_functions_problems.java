package Practice.Functions;

import java.util.Scanner;

public class all_functions_problems {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        printMax(a, b, c);
        printMin(a, b, c);
        EvenorOdd(a);
        isEligible(c);
        sum(a,b);
        circle(b);
        System.out.println(a+" is a Prime or Not: "+isPrime(a));
        Factorial(b);
        System.out.println("Sum of natuarl numbers: "+ sumOfNaturalNumbers(a));

    }
    static void printMax(int a,int b,int c){
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum number: " + max);
    }
    static void printMin(int a,int b,int c){
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Minimum number: " + min);
    }
    static void EvenorOdd(int a){
        if(a%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }
    }
    static void isEligible(int c){
        if(c>18){
            System.out.println("Elgible to Vote");
        }else{
            System.out.println("Not eligible");
        }
    }
    static void sum(int a,int b){
         System.out.println("Sum of two number: "+(a+b));
     }
     static void circle(int b){
       double circumference=2 * Math.PI * b;
       double area=Math.PI * b*b;
        System.out.println("Cirumference " +circumference+"and Area " + area+"of the circle");
    }
     static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
     static void Factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
         System.out.println("Factorial Of " +n+ " is : " +result);
    }

    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}

