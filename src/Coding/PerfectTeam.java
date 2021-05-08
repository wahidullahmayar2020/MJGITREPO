package Coding;

import java.util.HashMap;
import java.util.Map;

public class PerfectTeam {
    public static void main(String[] args) {

    }

    static int differentTeams(String skills) {


        Map<Character, Integer> characterIntegerHashMap = new HashMap<>();
        characterIntegerHashMap.put('p',0);
        characterIntegerHashMap.put('m',0);
        characterIntegerHashMap.put('b',0);
        characterIntegerHashMap.put('z',0);
        characterIntegerHashMap.put('c',0);


        for(int i=0; i<skills.length(); i++) {
            char ch = skills.charAt(i);
            characterIntegerHashMap.put(ch, (characterIntegerHashMap.get(ch)+1));
        }

        int minValue = Integer.MAX_VALUE;
        for (Integer value : characterIntegerHashMap.values()) {

            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}
