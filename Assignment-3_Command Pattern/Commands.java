import java.util.List;
import java.util.ArrayList;

public class Commands {
    
    private List < Order > orders = new ArrayList < Order > ();

    public void addOrders(Order order){
        orders.add(order);
    }

    public void placeOrder(){
        for(Order order : orders)
            order.execute();
            
        orders.clear();
    }
}
