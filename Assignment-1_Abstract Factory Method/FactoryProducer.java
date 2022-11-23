public class FactoryProducer {
    public static AbstractFactory getFactory(boolean realTime){
        if(realTime)
            return new RealTimeNotification();
        else 
            return new RegularNotification();
    }
}
