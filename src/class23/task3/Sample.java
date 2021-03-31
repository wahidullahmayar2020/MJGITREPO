package class23.task3;

public class Sample {
    static void printInfo(String name){
        System.out.println(name);
    }
    static void printInfo(String name,String address){
        System.out.println(name+address);
    }

    static void printInfo(String name,String address,String phoneNumber){
        System.out.println(name+phoneNumber+address);
    }

    public static void main(String[] args) {
        printInfo("MJ");
        printInfo("MJ","address 123");
        printInfo("MJ","address 123","1234566");
    }
}
