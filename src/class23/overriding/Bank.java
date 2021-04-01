package class23.overriding;

public class Bank {

    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+amount*0.02);
    }
}
class BankOfAmerica extends Bank{
    @Override
    void chargeTransferFee(double amount) {
        super.chargeTransferFee(amount);

    }

}

class Chase extends Bank{
    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+amount*0.03);
    }
}
class Citizen extends Bank{

}
