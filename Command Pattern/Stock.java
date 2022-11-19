public class Stock {
    
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Bought Stock[name: "+name+",Quantity: "+quantity+"]");
    }

    public void sell(){
        System.out.println("Sold Stock[name: "+name+",Quantity: "+quantity + "]");
    }
}
