package Searching.BinaryS;

public class BinarySearch {
    public static void main(String[] args) {
        // sorted array
        int[] arr={2,4,6,8,9,25,30};
        int target=9;
        int ans=binarySearch(arr,target);
        System.out.println("Index of " + target + " is at " +ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end =mid - 1 ;
            }else if(target > arr[mid]){
                start =mid + 1 ;
            }else {
                return  mid;
            }
        }
        return -1;
    }
}
