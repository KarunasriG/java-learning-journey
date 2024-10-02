package Practice.BasicPrograms;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lower = input.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = input.nextInt();
        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");

        for (int i = lower; i < upper ; i++) {
            int num=i,sum=0,temp=num;

            while (temp != 0){
                int rem =temp % 10;
                sum += Math.pow(rem,3);
                temp /=10;
            }
            if(sum == num){
                System.out.println(num);
            }
        }

    }
}
