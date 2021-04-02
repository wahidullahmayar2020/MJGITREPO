package reviewclass7.staticuse;

public class SingleTonPatterntester {



    public static void main(String[] args) {
        // Singletonpattern singletonpattern=new Singletonpattern();

        Singletonpattern singletonpattern=Singletonpattern.getObj();
        Singletonpattern.getObj();
        Singletonpattern.getObj();
        Singletonpattern.getObj();
        System.out.println(Singletonpattern.sum);
    }
}
