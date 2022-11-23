public class Cashier extends MoneyWithdrawal{
    
    public Cashier(float amount){
        this.amount = amount;
    }

    public void processTask(){
        System.out.println("Cashier Processing");
    }
}
