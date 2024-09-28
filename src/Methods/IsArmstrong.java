package Methods;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num=input.nextInt();
        //System.out.println(num+" Is Armstrong are not : "+ans);
        for(int i=1;i<1000;i++) {
            if(armstrong(i))
                System.out.print(i+" ");
        }
    }
    static boolean armstrong(int n){
        int r,sum=0,org=n;
        while(n>0){
            r=n%10;
            n=n/10;
            sum+=r*r*r;
        }
        return sum==org;
    }
}
