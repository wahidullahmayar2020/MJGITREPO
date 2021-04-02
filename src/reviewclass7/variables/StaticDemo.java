package reviewclass7.variables;

public class StaticDemo {
    static int sum;
    StaticDemo(){
        sum++;
    }
    static  void  printTotalObjectCreated(){

        System.out.println(sum);

    }
}
