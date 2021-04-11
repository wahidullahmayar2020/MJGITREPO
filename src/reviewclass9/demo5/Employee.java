package reviewclass9.demo5;
class Employee{
    public void method1(){
        System.out.println("line 4");
        method3();
    }
    public void method3(){
        System.out.println("line 8");
    }
}
class Secretary extends Employee{
    public void method3(){
        System.out.println("line 13");
        super.method3();
    }
}

class Lawyer extends Employee{
    public void method2(){
        System.out.println("line 20");
    }
    public  void method3(){
        System.out.println("line 23");
    }
}
class LegalSecratary extends Secretary{
    public void method2(){
        System.out.println("line 28");
    }
    public  void method3(){
        System.out.println("line 31");
    }

}