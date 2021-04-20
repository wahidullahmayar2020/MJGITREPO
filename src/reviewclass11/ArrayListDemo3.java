package reviewclass11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chiacgo");
        cities.add("Orlando");
        cities.add("virginia");
        cities.add("Palm beach");
        cities.add("Casablanca");
        cities.remove("Chiacgo");
        System.out.println(cities);
        if(cities.subList(0,1) instanceof ArrayList){
            System.out.println("Possible ");
            ArrayList<String> limitedCities= (ArrayList<String>) cities.subList(0,1);// Why Class cast error
        }else {
            System.out.println("Not a child ");
        }

       ArrayList<String> limitedCities=new ArrayList<>();
        System.out.println(limitedCities.getClass());
        System.out.println(cities.subList(0,1).getClass());
    }
}
