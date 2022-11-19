public class FileLogger extends AbstractLogger{
    
    public FileLogger(int level){
        this.level = level;
    }

    public void write(String message){
        System.out.println("File:: Logger: "+message);
    }
}
