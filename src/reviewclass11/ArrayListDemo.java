package reviewclass11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chiacgo");
        cities.add("Orlando");
        cities.add("virginia");
        cities.add("Palm beach");
        cities.add("Casablanca");
        for (String city:cities
             ) {
            System.out.println(city);
        }
        System.out.println("============================");
        for (int i = 0; i < cities.size(); i++) {
            if(i%2==0){
                System.out.println(cities.get(i));
            }
        }

        System.out.println("============================");
        int counter=0;
        while (counter<cities.size()){
            System.out.println(cities.get(counter));
            counter++;
        }

        System.out.println("============================");
        Iterator<String > iterator=cities.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
