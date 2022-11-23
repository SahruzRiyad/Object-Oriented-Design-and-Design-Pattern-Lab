public class NotificationService {
    public static void main(String[] args) {
        AbstractFactory notificationFactory = FactoryProducer.getFactory(false);

        notificationFactory.notifyUser("SMS").notifyUser();
        notificationFactory.notifyUser("Email").notifyUser();
        notificationFactory.notifyUser("PUSH Notification").notifyUser();

        notificationFactory = FactoryProducer.getFactory(true);

        notificationFactory.notifyUser("SMS").notifyUser();
        notificationFactory.notifyUser("Email").notifyUser();
        notificationFactory.notifyUser("PUSH Notification").notifyUser();;
    }
}
