package Searching.BinaryS;

public class Ceiling {
    public static void main(String[] args) {
        // sorted array .  ceiling of a number : A number that is smallest num which is greater than the target
        int[] arr={2,4,6,8,9,25,30};
        int target=25;
        int ans=binarySearch(arr,target);
        System.out.println("Index of a number that is smallest num which is greater than the " + target + " is " +ans);
    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
//        if the given number target num is greater then the last num in arr then return -1
        if(target>arr[end]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end =mid - 1 ;
            }else{
                start = mid + 1;
            }
//            }else {
//                return  mid;
//            }
        }
        return start;
    }
}
