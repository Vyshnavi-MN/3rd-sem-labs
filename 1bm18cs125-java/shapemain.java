import java.util.*;
abstract class shape
{
    abstract void printArea();
}

class rectangle extends shape
{
    double a1 , b1;
    rectangle(double a , double b)
    {
        a1 = a;
        b1 = b;
    }
    void printArea()
    {
        System.out.println("The area of rectangle is "+(a1 * b1));
    }
}

class triangle extends shape
{
    double a1 , b1;
    triangle(double a , double b)
    {
        a1 = a;
        b1 = b;
    }
    void printArea()
    {
        System.out.println("The area of triangle is "+(0.5 * a1 * b1));
    }
}

class circle extends shape
{
    double a1;
    circle(double a)
    {
        a1 = a;
    }
    void printArea()
    {
        System.out.println("The area of triangle is "+(3.14 * a1 * a1));
    }
}

class Main
{
  public static void main (String[] args) 
  {
      int choice = 0;
      double a , b;
      Scanner sc = new Scanner(System.in);
      while(choice != 4)
      {
        System.out.println("Enter your choice 1.Area of Rectangle 2.Area of Triangle 3.Area of Circle 4.Exit");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1 :  System.out.println("Enter length and breadth");
                      a = sc.nextDouble();
                      b = sc.nextDouble();
                      rectangle r = new rectangle(a,b);
                      r.printArea();
                      break;
            case 2 :  System.out.println("Enter height and base");
                      a = sc.nextDouble();
                      b = sc.nextDouble();
                      triangle t = new triangle(a,b);
                      t.printArea();
                      break;
            case 3 :  System.out.println("Enter the radius");
                      a = sc.nextDouble();
                      circle c = new circle(a);
                      c.printArea();
                      break;
            default : System.out.println("Invalid choice");
        }
      }
   }
}

