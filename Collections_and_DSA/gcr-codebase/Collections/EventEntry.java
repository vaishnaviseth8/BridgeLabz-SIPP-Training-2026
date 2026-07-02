package CollectionFrameworks;

import java.util.HashSet;
import java.util.Scanner;

public class EventEntryVerificationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> participants = new HashSet<>();

        while (true) {
            System.out.println("\n1. Register Participant");
            System.out.println("2. Display Participants");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Email ID: ");
                    String email = sc.nextLine();
                    if (participants.add(email))
                        System.out.println("Registration Successful");
                    else
                        System.out.println("Duplicate Registration Rejected");
                    break;

                case 2:
                    System.out.println("Registered Participants:");
                    for (String p : participants)
                        System.out.println(p);
                    System.out.println("Total Attendees: " + participants.size());
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
