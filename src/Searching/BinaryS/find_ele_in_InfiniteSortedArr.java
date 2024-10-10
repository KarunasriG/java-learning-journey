package Searching.BinaryS;

public class find_ele_in_InfiniteSortedArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,9,45,56,78,98,100,121,145,567,789};
        int target=9;
        int ans=findIndex(arr,target);
        System.out.println("Index of "+target+" is at "+ans);
    }
    static int findIndex(int[] arr,int target){
        int start=0;
        int end=1;
        // if target ele is greater than the end of the element we are searching
        // then no need to search in the range of start and end
        while(target>arr[end]){
            int temp_newStart= end+1;
             end= end + (end-start+1)*2;
             start=temp_newStart;
        }
     return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
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
