package class23.recap;

public class Calculator {

    private static void add(){

    }

    private static void add(int number){

    }

   /* private static void add(int number2){
CE error
    }*/

    public static void main(String[] args) {
        System.out.println("1");
        main("one");
    }

    public static void main(String args) {
        System.out.println("2");
    }

    public static void main(int args) {
        System.out.println("3");
    }
    public static void main(String args,int a) {
        System.out.println("4");
    }

}
