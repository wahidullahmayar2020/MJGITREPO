package class22.methodoverloading;

public class MethodOverloadingDemo2 {

    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
   /* void add(double a,double b){
        System.out.println(a+b);
    }*/
    void add(double a,int b){
        System.out.println(a+b);
    }

   /* int add(double a,int b){
      return a+b; CE error same parameters only return type is different
    }*/

    void add(int a,double b){
        System.out.println(a+b);
    }
   /* void add(double a,int b,int c){
        System.out.println(a+b+c);
    }*/
  /*  void add(int [] arr){
        int sum=0;
        for (int num:arr
        ) {
            sum+=num;
        }
        System.out.println(sum);
    }*/
    void add(int  ... arr){
        int sum=0;
        for (int num:arr
        ) {
            sum+=num;
        }
        System.out.println(sum);
    }

    // break 2:00

    public static void main(String[] args) {
        MethodOverloadingDemo2 ob1= new MethodOverloadingDemo2();
        ob1.add(10,10);
       // ob1.add(10.0,10.0);
       // ob1.add(10,10.0);
       /* ob1.add(10.0,10);
        ob1.add(10,10.0);
        ob1.add(10.0,10,25);
        */

        /*int[] arr={10,12,13};
        ob1.add(arr);
        ob1.add(10);
        ob1.add(10,10);
        ob1.add(10,10,25);
        ob1.add(10,25,36,45);*/


    }

}
