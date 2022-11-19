public class ProxyPatternDemo {

    public static void main(String[] args) {
        IImage image = new ProxyImage("me.jpg");
        
        image.display();
        System.out.println();

        image.display();
    }

}
