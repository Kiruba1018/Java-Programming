package lambda;

import java.util.*;
@FunctionalInterface
interface Rectangle
{
    int print(int l,int b);
}
interface square
{
    int print(int l1);
}
interface triangle
{
    int print(int b1,int h1);
}
interface circle
{
    double print(double r);
}
    

class Main {
    public static void main(String[] args)
    {
     Scanner s = new Scanner(System.in);
    //Area of the Rectangle
     Rectangle r = (int l,int b) ->{
        return (l*b);
     };
     int l = s.nextInt();
     int b = s.nextInt();
     System.out.println("Area of the Rectangle is "+r.print(l,b));

    //Area of the Square
     square sq = (int l1) ->{
        return (l1*l1);
     };
     int l1 = s.nextInt();
     System.out.println("Area of Square is "+sq.print(l1));
    
     //Area of the Triangle
     triangle t = (int b1,int h1) ->{
        return ((1/2) * b1 * h1);
     };
     int b1 = s.nextInt();
     int h1 = s.nextInt();
     System.out.println("Area of Triangle is "+t.print(b1,h1));
    
     //Area of the Circle
     circle c = (double r1) ->{
        return (3.14 * r1 * r1);
     };
     double r1 = s.nextDouble();
     System.out.println("Area of Circle is "+c.print(r1));

    }
}
