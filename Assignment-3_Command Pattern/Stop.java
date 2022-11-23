public class Stop implements Order{
    
    private Robot robot;
    
    public Stop(Robot robot){
        this.robot = robot;
    }

    public void execute(){

        robot.stop();
    }
}
