package Searching.LinearS;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,67,75,34};
        int target=67;
        int ans=linearSearch(arr,target,1,3);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }

        for(int index=start;index<end;index++){
            int element=arr[index];
            if(element==target){
                return index;   // returns the index of element
            }
        }
        return -1;
    }
}
