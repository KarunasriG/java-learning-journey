package Practice.BasicPrograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number of terms : ");
        int n=input.nextInt();
        int a=0,b=1,temp=0;
        System.out.print("Fibonacci Series: " +a+ "," +b);
        for (int i = 0; i <n ; i++) {
            temp=a+b;
            a=b;
            b=temp;
            System.out.print("," + b);
        }
    }
}
