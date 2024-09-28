package Methods;

public class Overloading {
    public static void main(String[] args) {
//no.of arguments should be different or type of arguments should be different
   demo("Kanna");
   demo(6);
   sum(6,7);
   sum(2,3,4);
    }
    static void demo(String x){
        System.out.println("Hello, " + x);
    }
    static void demo(int x){
        System.out.println(x);
    }
    static void sum(int x,int y){
        System.out.println(x+y);
    }
    static void sum(int x,int y,int z){
        System.out.println(x+y+z);
    }
}
