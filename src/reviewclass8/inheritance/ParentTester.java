package reviewclass8.inheritance;
public class ParentTester {
    public static void main(String[] args) {
        Child child=new Child("123456","Safiet");
        child.method2();
        System.out.println("++++++++++++++++++++++++++++++");
        GrandChild grandChild=new GrandChild("kjasfn","asdf");
        grandChild.method2();
    }
}
