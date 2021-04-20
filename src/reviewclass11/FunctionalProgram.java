package reviewclass11;

import java.util.ArrayList;

public class FunctionalProgram {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("DC");
        cities.add("Kiev");
        cities.add("Moscow");
        cities.add("LA");
        cities.add("New York");
        cities.add("Miami");
        System.out.println(cities);
      /*  int counter=0;
        for (String city:cities
             ) {
            if(city.contains("M")){
                counter++;
            }
        }
        System.out.println(counter);*/
        System.out.println(cities.stream().filter(city->city.contains("M")).count());


    }
}
