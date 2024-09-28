package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//       fun(3,6,9,12,15);
//       fun('a','e','i','o','u');
       multiple(6,9,"Kanna","Kutti","Ram","Sri");
    }
    static void multiple(int x,int y, String ...s){
        System.out.println(Arrays.toString(s));
    }
    static void fun(int ...x){
        System.out.println(Arrays.toString(x));
    }
    static void fun(char ...x){
        System.out.println(Arrays.toString((x)));
    }
}
