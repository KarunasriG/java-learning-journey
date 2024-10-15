package Searching.BinaryS;

public class findInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(findInMountainArray(arr,target));
    }
    static int findInMountainArray(int[] arr,int target) {
        int peak=findPeakElement(arr);
        int firstTry=OrderAgnosticBs(arr,target,0,peak);
        if(firstTry!=-1){
          return firstTry;
        }
        return OrderAgnosticBs(arr,target,peak+1,arr.length-1);
    }
    static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    static int OrderAgnosticBs(int[] arr,int target,int start,int end){
//        int start=0;
//        int end=arr.length-1;

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
