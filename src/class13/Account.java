package class13;

public class Account {

	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String userName,String password) {
		if(userName.equals(userName)&&password.equals(password)) {
			System.out.println("Welcome to bank of America your balance is "+balance);
		}else {
			System.out.println("Username or password is not correct");
		}
	}
	
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your Account number is "+
		accountNumber+" Your balance is "+
					balance);
		}
	}
	
	public void printUsernameAndPassword(String userName,String password) {

	if(userName.equals("Bryan")) {
		System.out.println("Hi Bryan");
	}else {
		System.out.println("By Bryan");
	}
	}
}
