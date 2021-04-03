package class25.overriding;

public class Ozoda extends KFather{
    public Ozoda(String name) {
        super(name);
    }

    @Override
    void sleep() {

        System.out.println(name+" likes to sleep"+16);
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+" likes to eat burger");
    }
}
