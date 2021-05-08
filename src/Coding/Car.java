package Coding;

public class Car {
    public void printTopSpeed(){
        System.out.println("Top speed of vehicle is 100 kmph");
    }
    public void printTopSpeed(int topSpeed){
        System.out.println("Top speed of vehicle is "+topSpeed+" kmph");
    }
    public void printTopSpeed(String vehicleName,int topSpeed){
        System.out.println("Top speed of "+vehicleName+" is "+topSpeed+" kmph");
    }
}
