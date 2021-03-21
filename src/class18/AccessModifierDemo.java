package class18;

public class AccessModifierDemo {

private String bankAccountPassword;
String SSNNumber;
public String name;

public void park() {
	System.out.println("Everyone can go to a public park");
}

void car() {
	System.out.println("My little brother you can have my car please don't destroy");
}

private void toothBursh() {
	System.out.println("No one should use it");
}

void printInfo() {
System.out.println(name);	
System.out.println(bankAccountPassword);
System.out.println(SSNNumber);

toothBursh();
}



}
