import java.util.Scanner; 

public class CommandPatternDemo{
    
    public static void main(String[] args) {
        
        Robot robot = new Robot();
        Commands commands = new Commands();

        Scanner sc= new Scanner(System.in);

        while(true){
            char input = sc.next().charAt(0);

            if(input == 's'){
                commands.addOrders(new Stop(robot));
                break;
            }

            else if(input == 'w')
                commands.addOrders(new WalkForward(robot));

            else if(input == 'z')
                commands.addOrders(new GoBackward(robot));
        
            else if(input == 'a')
                commands.addOrders(new TurnLeft(robot));
            
            else if(input == 'd')
                commands.addOrders(new TurnRight(robot));
        }
        
        commands.placeOrder();

        commands.addOrders(new WalkForward(robot));

        commands.placeOrder();
    }
}


