package Searching.BinaryS;

public class RotatedSortedArry {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(findIndex(nums,target));
    }

    static int findIndex(int[] nums,int target){
        int pivot = findPivot(nums); // get the pivot element
        int ans = 0;
        int start = 0;
        int end = nums.length - 1;
        if (pivot == -1) {
            return binarySearch(nums, target, start, end);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, start, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, end);
        }
    }

    static int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] <= nums[right]) {
            return -1;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid < right && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > left && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[left]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}