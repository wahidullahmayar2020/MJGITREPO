package reviewclass12.tasks;

import java.util.Collection;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {
        TreeMap<Integer,Person> treeMap=new TreeMap<>();
        treeMap.put(1,new Person("Jahanzeb ","Shah",25,100000));
        treeMap.put(2,new Person("Eugene  ","Markadanov",28,120000));
        treeMap.put(3,new Person("Tijana ","Rakic",18,110000));
        Collection<Person> personCollection =treeMap.values();
        for (Person person:personCollection
             ) {
            person.printDetails();
        }

    }
}
