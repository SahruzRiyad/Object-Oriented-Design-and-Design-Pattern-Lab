public class StopState implements IState{
    
    public void doAction(Context context){
        System.out.println("Player in Stop State");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
