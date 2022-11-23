public class RealTimeNotification extends AbstractFactory{
    public INotification notifyUser(String notificationType){
        if(notificationType.equalsIgnoreCase("SMS"))
            return new RealTimeSMS();
        else if(notificationType.equalsIgnoreCase("Email"))
            return new RealTimeEmail();
        else 
            return new PushNotification();
    }
}
