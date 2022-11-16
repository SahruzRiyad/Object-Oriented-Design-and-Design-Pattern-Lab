public class SingleObject{
    private static SingleObject uniqueInstance = null;

    private SingleObject(){

    }

    public void showMessage(){
        System.out.println("Inside Single Object");
    }
    
    public static SingleObject getInstance(){
        if(uniqueInstance == null){
            synchronized (SingleObject.class){
                uniqueInstance = new SingleObject();
            }
        }
        return uniqueInstance;
    } 
}