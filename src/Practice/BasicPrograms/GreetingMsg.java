package Practice.BasicPrograms;

import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
//      String name = input.nextLine(); // takes the cmplt line of input
        String name = input.next();  // takes the input upto next space

        System.out.println("Hello, "+name+ " Nice to meet you");
    }
}
