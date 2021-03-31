package class23.task4;

public class Sample {

    private void printInfo(String name){
        System.out.println(name);
    }
    private void printInfo(String name,String address){
        System.out.println(name+address);
    }

    private void printInfo(String name,String address,String phoneNumber){
        System.out.println(name+phoneNumber+address);
    }

    //8:27
    public static void main(String[] args) {
        Sample sample=new Sample();
       sample.printInfo("MJ");
       sample.printInfo("MJ","address 123");
       sample.printInfo("MJ","address 123","1234566");
    }
}
