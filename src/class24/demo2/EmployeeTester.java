package class24.demo2;

public class EmployeeTester {
    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.salary=100000;
        employee.getPaid();
        Contractor contractor=new Contractor();
        contractor.salary=50;
        contractor.getPaid();


    }
}
