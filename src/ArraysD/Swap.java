package ArraysD;

import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int[] arr={21,32,56,43,21,21,12};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] a){
        int start=0;
        int end=a.length-1;

        while(start<end){
          //  swap the values
            swap(a,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] ar,int index1,int index2){
        int temp=ar[index1];
        ar[index1]=ar[index2];
        ar[index2]=temp;
    }
}
