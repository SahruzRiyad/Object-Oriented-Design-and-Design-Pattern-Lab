public class RealImage implements IImage{
    
    public String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void display(){
        System.out.println("Displaying "+ fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("Loading "+fileName);
    }
}
