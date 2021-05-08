package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeviceNameSystem {
    public static void main(String[] args) {

        String[] devices={"switch","tv","switch","tv","switch","tv"};
       // List<String> devices=new ArrayList<>();

  }

    public static List<String> deviceNamesSystem(List<String> deviceNames) {
        String[] uniqueNames = new String[deviceNames.size()];

        for (int i = 0; i < deviceNames.size(); i++) {

            String name = deviceNames.get(i);
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {

                if (uniqueNames[j].equals(name)) {
                    duplicate = true;
                    break;
                }

            }

            if (!duplicate) {

                uniqueNames[i] = name;

            } else {


                int id = 1;

                boolean exists = true;


                while (exists) {


                    exists = false;


                    for (int j = 0; j < i; j++) {

                        if (uniqueNames[j].equals(name + id)) {

                            exists = true;

                            id++;


                            break;

                        }

                    }

                }


                uniqueNames[i] = name + id;

            }

        }

        return Arrays.asList(uniqueNames);

    }


}
