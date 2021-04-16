package reviewclass10;

public class BankAccount {
    private double accountBalance=100000;
    private String password="123";


    public double getBalance(String password){
        if(this.password==password){
            return accountBalance;
        }else {
            return -1;
        }
    }
}
