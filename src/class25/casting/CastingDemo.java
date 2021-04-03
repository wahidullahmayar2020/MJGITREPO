package class25.casting;

import class25.overriding.KFather;
import class25.overriding.Khadija;
import class25.overriding.Ozoda;

public class CastingDemo {
    public static void main(String[] args) {
        KFather kFather=new Ozoda("Ozoda");

        Ozoda ozoda=(Ozoda) kFather;

        double var1=10.0;
        int var2=(int)var1;
    }
}
