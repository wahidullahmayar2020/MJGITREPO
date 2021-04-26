package reviewclass12.tasks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("Ram");
        set.add("Bryan Espejo");
        set.add("Daryna Nazarenko");
        set.add("Ram");
        StringBuilder var= new StringBuilder();
        for (String name:set
             ) {
            var.append(name);
        }
        System.out.println(var);



    }
}
