package class16;

public class StringVsStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var1="USA";
		String var2="USA";
		String var3="USA";
		String var4=new String("USA");
		System.out.println(var1==var2);
		System.out.println(var1==var4);
		System.out.println(var1.equals(var2));
		System.out.println(var1.equals(var4));
		
		StringBuilder sb=new StringBuilder("USA");
		
		
	}

}
