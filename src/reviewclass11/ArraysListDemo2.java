package reviewclass11;

import java.util.ArrayList;
import java.util.List;

public class ArraysListDemo2 {


    public static void main(String[] args) {
        List<String> cities=new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chiacgo");
        cities.add("Orlando");
        cities.add("virginia");
        cities.add("Palm beach");
        cities.add("Chiacgo");
        cities.add("Casablanca");
        int index=cities.indexOf("virginia");
        cities.add(index+1,"Newyork");
        cities.add(0,"Alexandria");
        cities.add(0,"Lahore");

        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.indexOf("Chiacgo"));
        System.out.println(cities.lastIndexOf("Chiacgo"));
        System.out.println(cities.set(0,"Chiacgo"));
        System.out.println(cities);
        System.out.println(cities.remove("Chiacgo"));
        System.out.println(cities);
       // System.out.println(cities.remove(20)); RE
        int firstIndex=2;
        int lastIndex=4;
        System.out.println("=====subList==========");


        ArrayList<String> limitedCities= new ArrayList<>(cities.subList(firstIndex,lastIndex)) ;
        List<String> limitedCities1= cities.subList(firstIndex,lastIndex);
        System.out.println(limitedCities);
        System.out.println(limitedCities1);
        //Break 30 mint
    }
}
