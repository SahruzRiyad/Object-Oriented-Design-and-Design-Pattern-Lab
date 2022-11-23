public class WalkForward implements Order{
    
    private Robot robot;
    
    public WalkForward(Robot robot){
        this.robot = robot;
    }

    public void execute(){
            
        robot.walkForward();
        
    }
}
