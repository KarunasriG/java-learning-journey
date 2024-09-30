package ArraysD;

import java.util.*;

public class ArrofObj {
    public static void main(String[] args) {
        String[] str=new String[5];

        Scanner in =new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }

//        for(String s:str){
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(str));

    }
}
