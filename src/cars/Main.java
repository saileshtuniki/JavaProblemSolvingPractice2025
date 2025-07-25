//abstract method example 2
package cars;

abstract class Vehicle {
    public void start(){
        System.out.println("Vehicle Starting");
    }

    public void stop(){
        System.out.println("Vehicle Stopping");
    }

    public abstract String fuelType();
}


class Car extends Vehicle{

    @Override
    public String fuelType(){
        return "Petrol";
    }
}
class Truck extends Vehicle{
    @Override
    public String fuelType(){
        return "Diesel";
    }
}

public class Main
{
    public static void main(String[] args) {
        Vehicle bike = new Car();

        bike.start();
        System.out.println("Car fuel:"+ bike.fuelType());
        bike.stop();

        Vehicle truck = new Truck();
        truck.start();
        System.out.println("truck fuel:"+ truck.fuelType());
        truck.stop();
    }
}


