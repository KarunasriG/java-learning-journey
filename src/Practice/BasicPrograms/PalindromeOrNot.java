package Practice.BasicPrograms;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a word : ");
        String s=input.next();
        int len=s.length();
        boolean isPalindrome=true;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(len-1-i)){
                isPalindrome =false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }

    }
}
