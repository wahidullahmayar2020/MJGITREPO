package reviewclass12.tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> empMap=new LinkedHashMap<>();
        empMap.put("Alec Diaz",120000);
        empMap.put("Anastasia",150000);
        empMap.put("Afzal Rumon",150000);
        empMap.put("saleem Sadat",120000);
        Set<String> empKeys=empMap.keySet();
        Integer maxSalary=Integer.MIN_VALUE;

        String maxSalaryKey="";

        for (String key:empKeys
             ) {
            if(empMap.get(key)>maxSalary){
                maxSalary=empMap.get(key);
                maxSalaryKey=key;
            }
        }
        System.out.println(maxSalaryKey+" earns the Max salary"+empMap.get(maxSalaryKey));



    }
}
