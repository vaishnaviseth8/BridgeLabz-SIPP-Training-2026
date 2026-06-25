interface Trackable {
    void logActivity(String activity);

    default void resetData() {
        System.out.println("Activity data reset");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity(String activity) {
        System.out.println("Activity Logged: " + activity);
    }

    public void generateReport() {
        System.out.println("Generating Fitness Report");
    }

    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();

        device.logActivity("Running");
        device.generateReport();
        device.sendAlert("Daily Goal Achieved");
        device.resetData();
    }
}