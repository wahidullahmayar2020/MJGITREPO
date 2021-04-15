package reviewclass9.demo1;

public class Parent {

    String name;
    String address;

    public Parent(String name, String address) {
     this.name=name;
     this.address=address;    }
    void printInfo(){
        System.out.println("Name "+name+" Address "+address);
    }
}
class Child extends Parent{

    public Child(String name, String address) {
        super(name, address);
    }

    void printInfo(){
        System.out.println("Name "+name+" Address "+address+" from child");
    }
}
class Main{
    public static void main(String[] args) {
        Child child=new Child("Aziz","1234");
        child.printInfo();
        Parent[] allChilds={new Child("Roheen","12345")};
        for (Parent parent:allChilds
             ) {
            parent.printInfo();
        }
    }
}
