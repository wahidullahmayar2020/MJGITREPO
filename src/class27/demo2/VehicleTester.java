package class27.demo2;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("12345xml",
                "Sedan","BMW",
                "X5");

        bmw.start();
        bmw.stop();
        bmw.speed();
    }
}
