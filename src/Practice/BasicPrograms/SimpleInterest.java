package Practice.BasicPrograms;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double principal = input.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time = input.nextDouble();

        System.out.print("Enter Rate of interest (R): ");
        double rate = input.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
