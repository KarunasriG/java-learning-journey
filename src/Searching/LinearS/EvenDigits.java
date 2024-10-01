package Searching.LinearS;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={12,345,6789};
        int ans=  findNums(arr);
        System.out.println(ans);

    }
//    count the number of digits in a numver
    static int findNums(int[] nums){
       int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        if(num<0){
            num=num* (-1);
        }
        if(num == 0){
            return false;
        }
        int numC=0;
        while(num > 0){
            numC++;
            num=num/10;
        }
        if(numC % 2 == 0){
            return true;
        }
        return false;

    }
}
