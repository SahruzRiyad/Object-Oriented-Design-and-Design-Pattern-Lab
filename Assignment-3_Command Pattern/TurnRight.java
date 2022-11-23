public class TurnRight implements Order{
    
    private Robot robot;
    
    public TurnRight(Robot robot){
        this.robot = robot;
    }

    public void execute(){

        robot.turnRight();  
    }
}
