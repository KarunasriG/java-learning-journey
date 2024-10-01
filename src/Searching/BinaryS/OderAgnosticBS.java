package Searching.BinaryS;

public class OderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={2,4,6,8,9,25,30};
        int[] arr={9,8,2,1};
        int target=9;
        int ans=OrderAgnosticBs(arr,target);
        System.out.println("Index of " + target + " is at " +ans);
    }
    static int OrderAgnosticBs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        // checking the order of the array
        boolean isAsc =arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end =mid - 1 ;
                }else{
                    start =mid + 1 ;
                }
            }else{
                if(target > arr[mid]){
                    end =mid - 1 ;
                }else{
                    start =mid + 1 ;
                }
            }
        }
        return -1;
    }
}
