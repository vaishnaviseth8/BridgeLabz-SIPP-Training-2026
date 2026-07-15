package Polymorphism;

public abstract class Vehicle {
    String modal ;
    Vehicle(String modal){
        this.modal=modal;
    }

    public int fuelCost(int km){
        return 0;
    }
}
class Car extends Vehicle{

    Car(String modal){
        super(modal);
    }
    public int fuelCost(int km){
        return 10*km;

    }
}
class Bus extends Vehicle{
    Bus(String modal){
        super(modal);
    }

    public int fuelCost(int km) {
        return 20*km;
    }
}
class Bike extends Vehicle{

    Bike(String modal){
        super(modal);
    }

    public int fuelCost(int km) {
        return 30*km;
    }
}

class MainVehicle{
    public static void main(String[] args) {
        Car car=new Car("Maruti");
        Bus bus=new Bus("Volvo");
        Bike bike=new Bike("Honda");
        Vehicle[] vehicles={car,bus,bike};
        for(Vehicle s:vehicles){
            System.out.println(s.modal+":"+s.fuelCost(1));
        }
    }
}