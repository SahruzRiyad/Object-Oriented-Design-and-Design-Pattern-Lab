public class StartState implements IState{
    
    public void doAction(Context context){
        System.out.println("Player in Start State");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
