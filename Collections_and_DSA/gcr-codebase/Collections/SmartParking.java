package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vehicles = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Registration Number: ");
                    String add = sc.nextLine();
                    vehicles.add(add);
                    System.out.println("Vehicle Added");
                    break;

                case 2:
                    System.out.print("Enter Registration Number: ");
                    String remove = sc.nextLine();
                    if (vehicles.remove(remove))
                        System.out.println("Vehicle Removed");
                    else
                        System.out.println("Vehicle Not Found");
                    break;

                case 3:
                    System.out.print("Enter Registration Number: ");
                    String search = sc.nextLine();
                    if (vehicles.contains(search))
                        System.out.println("Vehicle is Parked");
                    else
                        System.out.println("Vehicle Not Found");
                    break;

                case 4:
                    System.out.println("Parked Vehicles:");
                    for (String v : vehicles)
                        System.out.println(v);
                    System.out.println("Occupied Slots: " + vehicles.size());
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
