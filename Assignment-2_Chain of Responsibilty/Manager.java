public class Manager extends MoneyWithdrawal{
    
    public Manager(float amount){
        this.amount  = amount;
    }

    public void processTask(){
        System.out.println("Manager Processing");
    }
}
