package Searching.LinearS;

import java.util.Arrays;

public class SearchinStrings {
    public static void main(String[] args) {
    String str="Karunasri";
    char target='u';
    System.out.println(search2(str,target));
//        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean search2(String str,char target){
        if(str.isEmpty()){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch== target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str,char target){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
