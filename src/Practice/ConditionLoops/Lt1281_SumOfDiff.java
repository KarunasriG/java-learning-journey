package Practice.ConditionLoops;

import java.util.Scanner;

public class Lt1281_SumOfDiff {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=input.nextInt();
        int sum=0,prod=1,rem=0;
        while (num>0){
            rem=num%10;
            sum += rem;
            prod *= rem;
            num = num/10;
        }
        System.out.println("Difference between sum and product of digits in number "+ (prod-sum));
    }
}
