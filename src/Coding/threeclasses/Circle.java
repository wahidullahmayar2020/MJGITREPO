package Coding.threeclasses;
public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    int getArea(){
        return (int)Math.ceil(Math.PI*Math.pow(radius,2));
    }
}

class Rectangle{
   double height;
   double width;

   public Rectangle(double height, double width) {
       this.height = height;
       this.width = width;
   }
    int getArea(){
        return (int)Math.ceil(height*width);
    }
}

class Square{

    double width;

    public Square( double width) {
        this.width = width;
    }

    int getArea(){
        return (int)Math.ceil(width*width);
    }
}