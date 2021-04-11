package reviewclass9.demo;

public class Parent {
    double PI=3.14;

    double calculateArea(double length,double width){
        return length*width;
    }

}

class  Child extends Parent{
    double PI=3.144548454;
    double area(double height,double width,double length){

        return height*calculateArea(length, width);
    }


    double calculateArea(double radius) {
        return this.PI*radius*radius;
    }
}
