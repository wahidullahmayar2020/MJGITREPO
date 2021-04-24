package class31.task5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>();
        cities.add("Moscow");
        cities.add("New York");
        cities.add("Albany");
        cities.add("Kiev");
        cities.add("Minsk");
        cities.add("Austin");
        //cities.removeIf(city -> city.startsWith("A"));
        Iterator<String> iterator= cities.iterator();
        while(iterator.hasNext()) {
            String city = iterator.next();
            if(city.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
