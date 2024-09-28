package Basics;

public class ControlStatements {
    public static void main(String[] args) {
        int num=5;
//        if else ( deciding which block code to run  based on condition )
        if(num >= 5){
            System.out.println("Hey this if block is executed when the condition is true");
        }else {
            System.out.println("Hey this if block is executed when the condition is true");
        }

//        while ( when we don't know no of iterations)
        int n=1;
        while(n<=5){
            System.out.println(n++);
            if(n==3){
                break;
            }
        }
//        for loop knowing no.of iterations
        for(int i=1;i<=num;i++){
            System.out.println(i);
            if(i==4){
                break;
            }
        }
//        for each loop
        int[] arr={1,2,3,4,5};
        for(int i : arr){
            System.out.println(i);
        }
//        switch case (having many if-else we can use switch case)
//        java is case-sensitive
        char ch = 'A';
        switch (ch) {
            case 'A':
                System.out.println("It's Capital Letter 'A' ");
                break;
            case 'a':
                System.out.println("It's Small Letter 'a' ");
                break;
            default:
                System.out.println("Didn't match any");
        }

    }
}
