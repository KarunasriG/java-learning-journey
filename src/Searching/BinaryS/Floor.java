package Searching.BinaryS;

public class Floor {
    public static void main(String[] args) {
        // floor : a number which is greatest and less than the target num
        int[] arr={2,4,6,8,9,25,30};
        int target=10;
        int ans=binarySearch(arr,target);
        System.out.println("Index of a number which is greatest and less than the target num " + target + " is " +ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        if(target < arr[0]){
            return -1;
        }
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
        return end;
    }
}
