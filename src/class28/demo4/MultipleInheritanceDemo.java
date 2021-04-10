package class28.demo4;

import class28.abstraction.Parent;

public class MultipleInheritanceDemo extends Parent1 {

}
class Parent1{
    void method(){
        System.out.println("method from Parent1");
    }
}

class Parent2{
    void method(){
        System.out.println("method from Parent2");
    }
}
class Tester{
    public static void main(String[] args) {
        MultipleInheritanceDemo multipleInheritanceDemo=new MultipleInheritanceDemo();
        multipleInheritanceDemo.method();
    }
}