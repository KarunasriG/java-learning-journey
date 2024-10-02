package Practice.ConditionLoops;

import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int r=sr.nextInt();
        float p= 3.14F;
        float result=(float)(p*r*r);//2πr-perimeter,πr2-area
        //        Area Of Circle -πr2
        //        Perimeter Of Circle -2πr
        System.out.println("Area of the Circle:"+result);
        result= (float) (2*p*r);
        System.out.println("Perimeter of the Circle:"+result);
        //        Area Of Triangle -(h*b)/2
        //        Area Of Isosceles Triangle -(h*b)/2
        //        Perimeter of Isosceles Triangle -2s+b

        int h=6,b=3;
        result=(h*b)/2;//area
        System.out.println("Area of the triangle:"+result);
        //        Area Of Rectangle -l*b
        //        Perimeter Of Rectangle -2(l+b)
        result=h*b;
        System.out.println("Area of the Rectangle:"+result);
        result=2*(h+b);
        System.out.println("Perimeter of the Rectangle:"+result);
        int s=4;
        //        Perimeter Of Square -4*s
        result=s*s;
        System.out.println("Area of the Sqaure:"+result);
        result=4*s;
        System.out.println("Perimeter of the Sqaure:"+result);
        //        Area Of Equilateral Triangle -√3 a2/ 4
        //        Perimeter Of Equilateral Triangle - 3a
        float f=1.73F;
        float area = ( f * r*r) / 4 ;
        System.out.println("Area of Equilateral Triangle is:"+area);
//        Area Of Parallelogram - b*h
//        Perimeter Of Parallelogram -2(b+h)

//        Area Of Rhombus - b*h or (d1*d2)/2
//        Perimeter Of Rhombus -4s

//        Volume Of Cone -(πr2)h/3
//        Volume Of Prism - b*h
//        Volume Of Cylinder-πr2h
//        Volume Of Sphere -(πr3)4/3
//        Volume Of Pyramid -lwh/3
//        Curved Surface Area Of Cylinder -2πrh
//        Total Surface Area Of Cube -6a

    }
}
