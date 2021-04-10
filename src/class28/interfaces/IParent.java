package class28.interfaces;

public  interface IParent {

    //private int number=10; all variables in interfaces are public
    public static final int number=10; // No need to make the variables as public static and final because they are already public static final
    int number2=20;
   /* IParent(){

    }*/ //Interface can not have constructors because they don't have instance fields

     void method1();
}
 interface IParent2{
    void method2();
}

class  AdvanceChild implements IParent,IParent2{

    @Override
    public void method1() {
        System.out.println("from Iparent");
    }

    @Override
    public void method2() {

        System.out.println("IParent2");
    }
}
