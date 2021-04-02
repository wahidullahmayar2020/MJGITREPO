package reviewclass7;

public class Repl159 {

    public static void main (String [] args){
        Employee obj1=new Employee("Joe","Smith",35,35000);
        obj1.method();
        Student obj2=new Student("Adam","Smith",15,10);
        obj2.method();
        Retiree obj3=new Retiree("Frank","Smith",15,"tour");
        obj3.method();
    }
}

  class Person{
    String name;
    String lastName;
    int age;
    Person(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
}
 class Employee extends Person{
    int salary;
    Employee (String name, String lastName, int age,int salary){
        super(name,lastName,age);
        this.salary=salary;
    }
    void method(){
        System.out.println (name+" "+lastName+" "+age+" "+salary);
    }
}
 class Student extends Person{
    int grade;
    Student(String name, String lastName, int age,int grade){
        super(name,lastName,age);
        this.grade=grade;
    }
    void method(){
        System.out.println (name+" "+lastName+" "+age+" "+grade);
    }
}
 class Retiree extends Person{
    String seniorActivity;
    Retiree(String name, String lastName, int age,String seniorActivity){
        super(name,lastName,age);
        this.seniorActivity=seniorActivity;
    }
    void method(){
        System.out.println (name+" "+lastName+" "+age+" "+seniorActivity);
    }
}