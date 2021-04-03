package class26;

public  class Parent {
   final void method1(){
        System.out.println(" No child is allowed to change me");
    }
    final void method1(String name){
        System.out.println(" No child is allowed to change me");
    }
}
class Child extends Parent{

   /* @Override
    void method1() {
        System.out.println("from child class"); //CE error can not override a final method
    }*/
}
