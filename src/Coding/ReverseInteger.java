package Coding;

public class ReverseInteger {
    public static void main(String[] args) {

        reverseInteger(54321);
        System.out.println();
       reverseInteger(5432100);
        System.out.println();
        reverseInteger(12345);
        System.out.println();
        reverseInteger(1);
        System.out.println();
        reverseInteger(12345);
    }
    public  static void reverseInteger(int N){
        int enable_print=0;
        while (N>0){
            if(enable_print==0 && N%10!=0){
                enable_print=1;
            } if(enable_print==1){
                System.out.print(N%10);
            }
            N=N/10;
        }
    }
}
