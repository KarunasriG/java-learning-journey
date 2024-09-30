package ArraysD;

import java.util.*;

public class Basic_Arr {
    public static void main(String[] args) {
//     syntax to declare an array
        int[] a = new int[2];
//         int []b;
//         int c[];
        char ch[] = {'a', 'c'};
//        default value will be stores for
//        int - 0 and
//        String - null ,
//        for char I got a symbol
//        System.out.println(ch[0]);

//        let add some values
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//      we can assign each value like arr[0]=67

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        for(int num : arr){
//            System.out.print(num + " ");
//        }

        System.out.println(Arrays.toString(arr));
    }
    }
