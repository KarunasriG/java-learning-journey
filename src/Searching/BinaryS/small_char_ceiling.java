package Searching.BinaryS;
// 744 question num
// :https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class small_char_ceiling {
    public static void main(String[] args) {

       char[] letters = {'c','j','f'};
       char  target = 'a';
       char ans=nextGreatestLetter(letters,target);
        System.out.println("The smallest character that is lexicographically greater than '" + target +"' in letters is :" +ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
