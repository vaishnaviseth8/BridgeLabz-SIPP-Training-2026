public class ChargingStation {
    int stationID;
    int unitsConsumed;
    static int totalStations;
    static int electricityRate=200;
    ChargingStation(int stationID,int unitsConsumed){
        this.stationID=stationID;
        this.unitsConsumed=unitsConsumed;
        totalStations++;
    }
    public static int countTotalStations(){
        return totalStations;
    }
    public int calculateBill(){
        int bill=unitsConsumed*electricityRate;
        return bill;

    }
    public void DisplayStationDetails(){
        System.out.println("StationId:"+stationID);
        System.out.println("Units Consumed:"+unitsConsumed);
        System.out.println("Electricity Rate: " + electricityRate);
        System.out.println("Bill: " + calculateBill());
        System.out.println("...........");
    }
}

class MainCharging{
    public static void main(String[] args) {
        ChargingStation s1=new ChargingStation(1,20);
        ChargingStation s2=new ChargingStation(2,56);
        ChargingStation s3=new ChargingStation(3,60);
        ChargingStation s4=new ChargingStation(4,80);
        ChargingStation s5=new ChargingStation(5,78);
        System.out.println(ChargingStation.countTotalStations());
        System.out.println(s1.calculateBill());
        System.out.println(s2.calculateBill());
        System.out.println(s3.calculateBill());
        s4.DisplayStationDetails();
        s5.DisplayStationDetails();
    }
}
