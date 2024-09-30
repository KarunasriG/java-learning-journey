package ArraysD;

import java.util.*;

public class MArryList {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        //   Multi Dimensional Array List
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //   System.out.println(list);

       //   Initialization

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

//        add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
