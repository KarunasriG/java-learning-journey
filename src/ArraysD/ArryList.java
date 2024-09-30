package ArraysD;

import java.util.*;

public class ArryList {
    public static void main(String[] args) {
//        syntax
        ArrayList<Integer> list=new ArrayList<>();
//        adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        printing
        System.out.println(list);

        Scanner in=new Scanner(System.in);
//        input  elements
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
//      get element at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

//        internally working
//        size is fixed internally
//        when we add another ele after the intitial size
//        then it doubles the array size and copies it

    }
}
