package class18;

public class Account {

	private double actualAccountBalance;
	private String actaulUserName;
	private String actualPassword;
	
	
	
	public boolean login(String enteredUserName,String enteredPasswrd) {
		return !enteredUserName.equals(actaulUserName)&& enteredPasswrd.equals(actualPassword);
	}
	
	public boolean signUp(String enteredUserName,String enteredPasswrd,double enteredBalance) {
		
		if(enteredUserName.length()>15) {
			return false;
		}else {
			actaulUserName=enteredUserName;
			actualPassword=enteredPasswrd;
			actualAccountBalance=enteredBalance;
			return true;
		}
		
	}
	boolean transferFunds(String Password,double enteredAccountBalance) {
		if(Password.equals(actualPassword) && enteredAccountBalance<=actualAccountBalance) {
			
			actualAccountBalance=actualAccountBalance-enteredAccountBalance;
			return true;
		}else {
			return false;
		}
	}
}
