package Practice.BasicPrograms;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first num: ");
        int x=input.nextInt();
        System.out.print("Enter second num: ");
        int y=input.nextInt();
        int z= x > y ? x : y;
        System.out.println(z +" is the Largest Num");

    }
}
