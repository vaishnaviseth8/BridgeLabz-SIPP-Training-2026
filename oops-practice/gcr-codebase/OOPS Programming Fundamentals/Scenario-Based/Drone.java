public class Drone {
    int droneID;
    int batteryPercentage;
    static String companyName="abc";
    Drone(int droneID,int batterypercentage){
        this.droneID=droneID;
        this.batteryPercentage=batterypercentage;
    }
    public void displayStatus(){
        System.out.println("DRONE ID:"+droneID);
        System.out.println("Batterpercentage:"+batteryPercentage);
        System.out.println("Company Name : " + companyName);
    }
    public void startDelivery(int batteryUsed){
        if(batteryUsed<batteryPercentage){
            batteryPercentage=batteryPercentage-batteryUsed;
            System.out.println("remmaining battery:"+batteryPercentage);
        }
        else{
            System.out.println("low battery");
        }
    }
}
class MainDrone{
    public static void main(String[] args) {
        Drone d1=new Drone(1,45);
        Drone d2=new Drone(2,67);
        Drone d3=new Drone(3,87);
        Drone d4=new Drone(4,90);
        d1.startDelivery(20);
        d2.startDelivery(35);
        d3.startDelivery(10);
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        System.out.println("Company Name of d1: " + Drone.companyName);
        System.out.println("Company Name of d2: " + Drone.companyName);
        System.out.println("Company Name of d3: " + Drone.companyName);

    }
}
