package reviewclass10;

public  interface Interface1I {
    int number1=10;
      void method1();
      default void method2(){
          System.out.println(" method 1");
      }
      static void method3(){
          System.out.println(" static method");
      }
}
