public abstract class MoneyWithdrawal{

    public static float cashierAmount = 0;
    public static float seniorOfficerAmount = 10;
    public static float managerAmount = 100;

    MoneyWithdrawal nextHandler;
    protected float amount;

    public void setNextHandler(MoneyWithdrawal nextHandlder){
        this.nextHandler = nextHandlder;
    }

    public void handlerMessage(float amount){

        if(this.amount < amount){
            processTask();
        }

        if(nextHandler != null)
            nextHandler.handlerMessage(amount); 
        
    }

    public abstract void processTask();
}