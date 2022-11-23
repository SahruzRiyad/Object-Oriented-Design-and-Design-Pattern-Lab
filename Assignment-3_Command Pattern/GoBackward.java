public class GoBackward implements Order{
    
    private Robot robot;
    
    public GoBackward(Robot robot){
        this.robot = robot;
    }

    public void execute(){
            
        robot.goBackward();
    }
}
