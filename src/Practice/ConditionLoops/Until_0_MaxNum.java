package Practice.ConditionLoops;

import java.util.Scanner;

public class Until_0_MaxNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the numbers (to stop enter 0): ");
        int maxNum=Integer.MIN_VALUE;
        while (true){
            int num=input.nextInt();
            if(num==0){
                break;
            }
            else{
                maxNum= Math.max(num,maxNum);
            }
        }
        System.out.println("largest number from the entered values : " +maxNum);
    }
}
