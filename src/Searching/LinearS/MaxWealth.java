package Searching.LinearS;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3}
                ,{3,2,1},
                {4,6,9}};
        int max=Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum=0;
            for(int amount : account){
                sum += amount;
                max = Math.max(sum,max);
            }

        }
        System.out.println("Max of the amount in accounts : " + max);
    }
}
