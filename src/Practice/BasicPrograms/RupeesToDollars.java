package Practice.BasicPrograms;

import java.util.Scanner;

public class RupeesToDollars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = input.nextDouble();

        double usd = inr / 82.5; //  just assume  1 USD = 82.5 INR
        System.out.println("Equivalent amount in USD: " + usd);
    }
}
