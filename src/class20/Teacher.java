package class20;

public class Teacher extends Person {
    double salary;
    String degree;

    void teaches(){
        System.out.println(name+" teaching");
    }
    void confusing(){
        System.out.println(name+" confusing");
    }

}
