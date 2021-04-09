package reviewclass8.inheritance;

public class Parent {
    private String bankAccount;
    public String Name;

    public Parent(String bankAccount, String name) {
        this.bankAccount = bankAccount;
        Name = name;
    }
    public void method1(){
        System.out.println("public method");
    }
    protected void method2(){
        System.out.println("protected method");
    }
    private void method3(){
        System.out.println("private method");
    }
     void method4(){
        System.out.println("Default method");
    }
}
class Child extends Parent{

    public Child(String bankAccount, String name) {
        super(bankAccount, name);
    }

    @Override
    public void method1() {
        System.out.println("from child");
    }

    @Override
    protected void method2() {
        super.method2();
        this.method1();
        super.method1();
    }
}
class GrandChild extends Child{

    public GrandChild(String bankAccount, String name) {
        super(bankAccount, name);
    }


    @Override
    public void method1() {
        System.out.println("Grand child");
    }
}
