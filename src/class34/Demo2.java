package class34;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {
    public static void main(String[] args)  {
        int[] arr={10,20};

        int index=-1;
        if(index>= arr.length || index<0){
            System.out.println("Index out of bound");
        }else {
            System.out.println(arr[5]);
        }
        String name=null;

        if(name!=null){
            name.length();
        }else {
            System.out.println("Null object");
        }

        String path="C:\\Users\\Asghar Nazir\\Desktop\\Memory\\Test.xlsx";


        File file=new File(path);
            if(file.exists()){
                System.out.println("File foud");
                try {
                    FileInputStream fileInputStream=new FileInputStream(path);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }else {
                System.out.println("File not found");
            }
    }
}
