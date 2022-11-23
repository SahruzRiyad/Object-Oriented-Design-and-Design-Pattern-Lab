public class RegularNotification extends AbstractFactory{
    public INotification notifyUser(String notificationType){
        if(notificationType.equalsIgnoreCase("SMS"))
            return new SMS();
        else if(notificationType.equalsIgnoreCase("Email"))
            return new Email();
        else 
            return new PushNotification();
    }
}
