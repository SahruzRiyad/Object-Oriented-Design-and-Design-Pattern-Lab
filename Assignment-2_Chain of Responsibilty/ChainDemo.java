public class ChainDemo {
    
    private static MoneyWithdrawal getChainOfHandler(){
        MoneyWithdrawal cashier = new Cashier(MoneyWithdrawal.cashierAmount);
        MoneyWithdrawal seniorOfficer = new SeniorOfficer(MoneyWithdrawal.seniorOfficerAmount);
        MoneyWithdrawal manager = new Manager(MoneyWithdrawal.managerAmount);

        cashier.setNextHandler(seniorOfficer);
        seniorOfficer.setNextHandler(manager);

        return cashier;
    }

    public static void main(String[] args) {
        
        MoneyWithdrawal handlerChain = getChainOfHandler();

        handlerChain.handlerMessage(2);
        handlerChain.handlerMessage(20);
        handlerChain.handlerMessage(200);
    }
}
