public class ErrorLogger extends AbstractLogger{
    
    public ErrorLogger(int level){
        this.level = level;
    }

    public void write(String message){
        System.out.println("Error :: Logger: "+message);
    }
}
