package Searching.LinearS;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,67,75,34};
        int target=67;
        int ans=linearSearch(arr,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

//        for(int element : arr) {
//        if(element==target){
//                return element;   //returns the index value
//        }
//    }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                 return index;   // returns the index of element
            }
        }
        return -1;
    }
}
