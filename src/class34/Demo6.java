package class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) {
        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\est.xlsx";
        FileInputStream fileInputStream = null;
       // System.out.println(10/0);
        try {

             fileInputStream=new FileInputStream(path);
            System.out.println("Next line of code ");
            return;
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(10/0);
            fileNotFoundException.printStackTrace();
        }finally {

               // System.out.println(10/0);
                System.out.println("Will always be executed");
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println(10/0);



    }
}
