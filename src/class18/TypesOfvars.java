package class18;

public class TypesOfvars {

	String name;
	static String CompanyName="Syntax";
	
	void printInfo() {
		System.out.println(name+ "Company "+CompanyName);
	}
	
	static void printCompanyInfo() {
		//System.out.println(name); CE
		System.out.println(CompanyName);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypesOfvars obj1= new TypesOfvars();
		obj1.name="Ram";
		
		TypesOfvars obj2= new TypesOfvars();
		obj2.name="Aiman";
		
		TypesOfvars.printCompanyInfo();

	}

}
