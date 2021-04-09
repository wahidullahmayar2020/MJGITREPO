package reviewclass8.constructors;

public class Employee {
    private String name;
    private String empID;
    private String grade;
    private String departments;

    public void method1() {
        System.out.println("important code");
    }

    public Employee(String name, String empID, String grade, String departments) {
       /* this.name = name;
        this.empID = empID;
        this.grade = grade;*/
        this(name, empID, grade);
        this.departments = departments;
        this.method1();
    }

    public Employee(String name, String empID, String grade) {
        /*this.name = name;
        this.empID = empID;*/
        this(name, empID);
        this.grade = grade;
    }

    public Employee(String name, String empID) {
        /*   this.name = name;*/
        this(name);
        this.empID = empID;

    }

    public Employee(String name) {
        this();
        this.name = name;

    }

    public Employee() {
        toString();
        System.out.println("important line of code must be executed whenever an object of this class is created");
        System.out.println("important line of code must be executed whenever an object of this class is created");
        System.out.println("important line of code must be executed whenever an object of this class is created");
        System.out.println("important line of code must be executed whenever an object of this class is created");
        System.out.println("important line of code must be executed whenever an object of this class is created");
        System.out.println("important line of code must be executed whenever an object of this class is created");
        System.out.println("important line of code must be executed whenever an object of this class is created");
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Roheen", "123", "M4", "IT");
        Employee employee1 = new Employee();
    }


}
