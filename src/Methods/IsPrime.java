package Methods;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        System.out.println(num+" is Prime or not:"+isPrime(num));
    }
    static boolean isPrime(int n)
    {
        if(n <= 1){
            return false;
        }
        int count=2;    // upto the count 1 is not prime & 2 is prime
        // if the number is divided by any other number then it will be not prime & upto c*c <=n be checked
        while(count*count<=n)
        {
            if(n%count==0){
                return false;
            }
            count++;
        }
        return count*count>n;
    }
}
