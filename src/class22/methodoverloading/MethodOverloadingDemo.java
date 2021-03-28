package class22.methodoverloading;

public class MethodOverloadingDemo {
    void add(int a,int b){
        System.out.println(a+b);
    }

    void addDoubles(double a,double b){
        System.out.println(a+b);
    }

    void addArrays(int[] arr){
        int sum=0;
        for (int num:arr
             ) {
sum+=num;
        }
        System.out.println(sum);
    }

    void addThreeNumbers(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo=new MethodOverloadingDemo();
        methodOverloadingDemo.add(10,20);
        methodOverloadingDemo.addThreeNumbers(10,20,30);
        methodOverloadingDemo.addDoubles(10.5,20.5);
        int[] arr= {10,10,10};
        methodOverloadingDemo.addDoubles(10.5,20);
        System.out.println(10);
        System.out.println(10.0);
        System.out.println("10");

    }
}
