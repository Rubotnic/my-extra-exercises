package se.lexicon.car;

public class CarInformation {
    String brandName = "Volvo";
    String registraionNumber = "PRO888";
    short maxSpeed = 50;
    String ownerName = "Rob";
    String carColor = "red";
    int price = 2000;

    CarInformation(){
        System.out.println("DREAM CAR");

    }

    public void startCarInformation1(){
        System.out.println("Car information:");
    }
    public void getCarInformation(){

        System.out.println("Car brand: " + brandName);
        System.out.println("Registration number: " + registraionNumber);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Owner name: " + ownerName);
        System.out.println("Car color " + carColor);
        System.out.println("Price: " + price + " VES");

    }
    public void startCarInformation() {
    }

}
