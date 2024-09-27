package Basics;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        input
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a x number : ");
        int x=input.nextInt();
        System.out.print("Enter a number : ");
        int y=input.nextInt();
        System.out.println("Sum of your input values :" + (x+y) );
    }
}
