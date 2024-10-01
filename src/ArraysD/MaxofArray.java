package ArraysD;

public class MaxofArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,89,27};
//        System.out.println(maxof(arr));
        System.out.println(maxof(arr,4,2));
    }
    static int maxof(int[] arr,int start,int end){
//        if array is empty
        if(arr.length==0){
            return -1;
        }
        if(end<start){
            return -1;
        }

        int maxVal=arr[start];

        for (int i = start; i <=end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
