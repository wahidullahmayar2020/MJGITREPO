package class27;

import reviewclass8.constructors.ConsDemo;

public class Test extends ConsDemo{

    Test(){
        super("name","add");
       // super.name="test"; default access can not access it
        super.address="Test";
        method2();
        method4();
    }

    public static void main(String[] args) {
        ConsDemo consDemo=new ConsDemo();
        consDemo.phoneNumber="4545";
        consDemo.method4();
        //consDemo.address="test"; protected access
       // ConsDemo consDemo1=new ConsDemo("not allowed"); CE can not access this constructor outside of the package

      //  ConsDemo consDemo1=new ConsDemo("name","address");


    }
}
