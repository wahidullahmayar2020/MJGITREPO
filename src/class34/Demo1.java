package class34;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args)  {

        System.out.println("Important code");
        System.out.println("Important code");
        System.out.println("Important code");
        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\est.xlsx";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("The file that you are trying to read from this path "+path+" is not present there");
            System.out.println(" sends and email to the admin");
           // File file=new File(path);
        }
        try{
            System.out.println("Inside try block");

            String name=null;
            name.length();
        }catch (NullPointerException exception){
            System.out.println("Catch block");
            System.out.println("Catch block");
            System.out.println("Catch block");
        }catch (Exception nullPointerException){

        }

        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");

    }
}
