package class28.demo3;

public interface Person {
    void sleep();
    void eat();
}
interface Employee{
    void work();
}

interface SyntaxEmployee extends Person,Employee{
   void teach();
    void work();
}

class Emp implements SyntaxEmployee{

    @Override
    public void sleep() {

        System.out.println("Syntax employees sleep");
    }

    @Override
    public void eat() {
        System.out.println("Syntax employees eat");
    }

    @Override
    public void work() {
        System.out.println("Syntax employees work");
    }

    @Override
    public void teach() {
        System.out.println("Syntax employees teach");
    }
}