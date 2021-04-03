package class25.overriding;

public class Khadija extends KFather{

    Khadija(String name){
        super(name);
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+" likes beans as well");
    }

    @Override
    void sleep() {
        System.out.println(name+" likes to sleep 12 hours");
    }
}
