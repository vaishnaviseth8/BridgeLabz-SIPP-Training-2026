package CollectionFrameworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmartClassroomAttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, ArrayList<String>> attendance = new HashMap<>();

        while (true) {
            System.out.println("\n1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String student = sc.nextLine();

                    attendance.putIfAbsent(subject, new ArrayList<>());

                    if (!attendance.get(subject).contains(student)) {
                        attendance.get(subject).add(student);
                        System.out.println("Attendance Marked");
                    } else {
                        System.out.println("Duplicate Attendance Not Allowed");
                    }
                    break;

                case 2:
                    for (Map.Entry<String, ArrayList<String>> entry : attendance.entrySet()) {
                        System.out.println("\nSubject: " + entry.getKey());
                        for (String s : entry.getValue())
                            System.out.println(s);
                        System.out.println("Total Students: " + entry.getValue().size());
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
