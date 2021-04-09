package reviewclass8.constructors;

public class ConsDemo {
    String name;
   protected String address;
   public String phoneNumber;
    public  ConsDemo() {

    }

    ConsDemo(String name) {
        this.name = name;
    }

    protected ConsDemo(String name,String address){

    }

    void method1(){
        System.out.println("Method with Default access");
    }
   protected void method2(){
        System.out.println("Method with protected access");
    }
   private void method3(){
        System.out.println("Method with private access");
    }
   public void method4(){
        System.out.println("Method with public access");
    }

}
