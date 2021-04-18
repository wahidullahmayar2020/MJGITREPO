package class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("TestNG");
        Iterator<String> iterator=subjects.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
           System.out.println(iterator.hasNext());
           System.out.println(iterator.next());
           if(iterator.next().length()>4){
               iterator.remove();
           }

       }


    }
}
