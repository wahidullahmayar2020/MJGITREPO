package class34;

public class Demo4 {
    public static void main(String[] args) {
        try{ //System.out.println(10/0);
            //String name=null;
          //  System.out.println(name.length());
            int arr[]={10,60};
            System.out.println(arr[5]);
            String var2="abs";
            var2.charAt(10);
        }catch (NullPointerException e){
            System.out.println("Can not call methods on a null object");
        }catch (ArithmeticException arithmeticException){
            System.out.println("Can not divide by zero please contact Saleem");
        }catch (Exception e){
            System.out.println("To handle any other error");
        }
    }
}
