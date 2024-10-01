package Searching.LinearS;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {2,4,67,8},
                {56,87,90,3},
                {2,4,5,6}
        };
        int target=67;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Max of array "+ max(arr));
    }
    static int[] search(int[][] arr,int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element>max){
                 max=element;
                }
            }
        }
        return max;
    }
}
