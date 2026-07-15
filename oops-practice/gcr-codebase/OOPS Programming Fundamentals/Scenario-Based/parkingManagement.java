public class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;
    Vehicle(String vehicleNumber,String ownerName,String vehicleType){
        this.vehicleNumber=vehicleNumber;
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public static void displayCars(Vehicle[] vehicles){
        for(int i = 0; i < vehicles.length; i++) {
            if(vehicles[i].vehicleType.equals("Car")) {
                System.out.println(vehicles[i].vehicleNumber);
                System.out.println(vehicles[i].ownerName);
                System.out.println(vehicles[i].vehicleType);
            }
        }

    }
    public static void displayBikes(Vehicle[] vehicles){
        for(int i=0;i<vehicles.length;i++){
            if(vehicles[i].vehicleType.equals("Bike")){
                System.out.println(vehicles[i].vehicleNumber);
                System.out.println(vehicles[i].ownerName);
                System.out.println(vehicles[i].vehicleType);
            }
        }

    }
}
class MainVehicle{
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[10];
        vehicles[0] = new Vehicle("UP14AB1234", "Vaishnavi", "Car");
        vehicles[1] = new Vehicle("DL05XY5678", "Rahul", "Bike");
        vehicles[2] = new Vehicle("HR26PQ1111", "Aman", "Car");
        vehicles[3] = new Vehicle("UP32CD9876", "Sneha", "Bike");
        vehicles[4] = new Vehicle("RJ14LM4321", "Priya", "Car");
        vehicles[5] = new Vehicle("MP09GH7654", "Arjun", "Bike");
        vehicles[6] = new Vehicle("PB10JK2468", "Neha", "Car");
        vehicles[7] = new Vehicle("UK07MN1357", "Rohan", "Bike");
        vehicles[8] = new Vehicle("CG15QR8642", "Anjali", "Car");
        vehicles[9] = new Vehicle("BR01ST9753", "Karan", "Bike");
        Vehicle.displayBikes(vehicles);
        Vehicle.displayCars(vehicles);

    }
}
