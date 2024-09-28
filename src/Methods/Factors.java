package Methods;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sr.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
