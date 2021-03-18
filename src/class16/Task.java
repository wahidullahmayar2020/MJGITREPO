package class16;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var = "Hi i want lo learn java";
		System.out.println(var.replace(" ", ""));
		
		System.out.println("_______________two_____________________________");
		String var1 = "@#$$%%%!12344567ase      dfrgvrbnh";
		String str = var1.replaceAll("[^a-zA-Z]", "").replaceAll(" ", "");
		
		System.out.println(str.length());
		
		
		System.out.println("_______________Three_____________________________");
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] b = a.split("[?]");
		
		System.out.println(b.length);
	}
}
