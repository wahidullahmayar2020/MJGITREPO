package reviewclass11;

import java.util.ArrayList;

public class FunctionalProgramming {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("DC");
        cities.add("Kiev");
        cities.add("Moscow");
        cities.add("LA");
        cities.add("New York");
        cities.add("Miami");
        System.out.println(cities);
       /* for (String city:cities
             ) {
            if(city.contains("M")){
                cities.remove(city);
            }
        }*/

        cities.removeIf(city -> city.contains("M"));
        System.out.println(cities);

    }
}
