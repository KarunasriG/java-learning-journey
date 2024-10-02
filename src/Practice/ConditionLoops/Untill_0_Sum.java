package Practice.ConditionLoops;

import java.util.Scanner;

public class Untill_0_Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the numbers to sum them (to stop enter 0): ");
        int sum=0;
        while (true){
            int num=input.nextInt();
            if(num==0){
                break;
            }
            else{
                sum +=num;
            }
        }
        System.out.println("Sum of the entered digits: " +sum);
    }
}
