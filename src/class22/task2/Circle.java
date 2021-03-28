package class22.task2;

public class Circle extends Shape{

    Circle(double radius) {
        super(radius);
    }

    void calculateArea(){
        System.out.println(Math.pow(radius,2)*Math.PI);
        System.out.println(radius*radius*3.14);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.calculateArea();
    }
}
