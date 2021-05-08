package class34;

public class Account {
    double balance;
    Account(double balance){
        this.balance=balance;
    }
    public  void transfer(double amountToTransfer) throws InsufficientFundsException,NullPointerException{
        if(balance<amountToTransfer){
            //System.out.println("Insufficient funds");
            throw new InsufficientFundsException("Not enough balance");
           // System.out.println("snfgbgb");
        }
    }
}
