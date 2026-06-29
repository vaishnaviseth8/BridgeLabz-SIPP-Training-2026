
public class FitnessDevice implements Notifiable,Reportable,Trackable {
      public void logActivity(){
          System.out.println("Please login again");
      }

      public void sendAlert(){
          System.out.println("This is your alert");
      }

      public void generateReport(){
          System.out.println("Report has been generated");
      }

}
