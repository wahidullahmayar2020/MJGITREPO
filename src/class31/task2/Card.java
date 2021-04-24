package class31.task2;
public abstract class Card {
    String creditCardType;
    Card(String creditCardType){
        this.creditCardType=creditCardType;
    }
    abstract void calculateInterest();
    public void IssueCard(){
        System.out.println(creditCardType+ "Issued ");
    }
}

class CreditCard extends Card {
    CreditCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is 15%");
    }
}
class DebitCard extends Card{

    DebitCard(String creditCardType) {
        super(creditCardType);
    }
    @Override
    void calculateInterest() {
        System.out.println("interest is 0 but has a fee of 20 USD");
    }
}

class PrepaidCard extends Card{

    PrepaidCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Must pay all the money before hand");
    }
}