package Searching.BinaryS;

public class first_last_occurrence {
    public static void main(String[] args) {
        int[] arr={2,3,7,7,8,8,9};
        int target=8;
        // declaring an array initially with {-1,-1}
        int[] ans = {-1, -1};
        // if first occurrence is present then look for last
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        System.out.println(ans[0] + " " + ans[1]);

    }
    static int search(int[] arr,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
            // if the target is not > or < then it might be mid
            // so taking mid as potential answer and checking if the target might be fall in left or right side
            // findStartIndex is true means the target first occurrence may lie at left side
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
