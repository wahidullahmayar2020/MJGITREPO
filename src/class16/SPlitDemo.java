package class16;

public class SPlitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break till 8:45
		String var1="Today is Wednesday";
		//System.out.println(var1.length());
		String[] strArr=var1.split(" ");
		for(String word:strArr) {
			System.out.println(word);
		}
		
		String var2="Syntax is best. batch 9 is great.";
		String[] strArr2=var2.split("[.]");
		
		for(int i=0;i<strArr2.length;i++) {
			System.out.println(strArr2[i]);	}
		//method chaining
		String var3="      SYNTAX     ";
		System.out.println(var3.trim().toLowerCase());
		
		String var4="hi what are you doining";
	System.out.println(convert(var4));
	}
	static String convert(String str)
    {
 
        // Create a char array of given String
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
 
            // If first character of a word is found
            if (i == 0 && ch[i] != ' ' || 
                ch[i] != ' ' && ch[i - 1] == ' ') {
 
                // If it is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') {
 
                    // Convert into Upper-case
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
 
            // If apart from first character
            // Any one is in Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z') 
 
                // Convert into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');            
        }
 
        // Convert the char array to equivalent String
        String st = new String(ch);
        return st;
    }
}
