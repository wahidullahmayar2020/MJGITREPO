package class34;

public class Demo9 {
    public static void main(String[] args) {
        Account account=new Account(100);
        try {
            account.transfer(1000);
        }catch (InsufficientFundsException e){
            e.getMessage();
        }

    }
}
