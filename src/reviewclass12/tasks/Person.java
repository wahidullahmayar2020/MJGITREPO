package reviewclass12.tasks;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printDetails(){
        System.out.println("FirstName "+firstName+" LastName "+lastName);
        System.out.println("Age "+age +" Salary "+salary);
    }
}
