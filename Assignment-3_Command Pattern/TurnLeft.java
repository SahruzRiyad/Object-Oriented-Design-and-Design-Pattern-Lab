public class TurnLeft implements Order{
    
    private Robot robot;
    
    public TurnLeft(Robot robot){
        this.robot = robot;
    }

    public void execute(){

        robot.turnLeft();  
    }
}
