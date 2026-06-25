package Polymorphism;

public class Notification {
    String recipientName;
    String message;

    Notification(String recipientName,String message) {
        this.recipientName = recipientName;
        this.message = message;
    }
    public void sendNotification(){
        System.out.println("this is your message");
    }
}

class EmailNotification extends Notification{
     EmailNotification(String recipientName,String message){
         super(recipientName,message);
     }

     public void sendNotification(){

             System.out.println("Email sent to " + recipientName + ": " + message);


     }
}
class SMSNotification extends Notification{
    SMSNotification(String recipientName,String message){
        super(recipientName,message);
    }

    public void sendNotification(){
        System.out.println("SMS sent to " + recipientName + ": " + message);


    }
}
class PushNotification extends Notification{
    PushNotification(String recipientName,String message){
        super(recipientName,message);
    }

    public void sendNotification(){
        System.out.println("Push Message sent to " + recipientName + ": " + message);

    }
}

class MainNotification{
    public static void main(String[] args) {
        EmailNotification e=new EmailNotification("Vaishnavi","This is your Email message");
        SMSNotification s=new SMSNotification("Apeksha","This is your SMS");
        PushNotification p=new PushNotification("Krishna","This is your Push message");
        Notification[] notifications={e,s,p};
        for(Notification n:notifications){
            n.sendNotification();
        }
    }
}
