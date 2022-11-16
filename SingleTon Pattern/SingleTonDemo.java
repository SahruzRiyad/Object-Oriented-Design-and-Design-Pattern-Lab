public class SingleTonDemo {
    public static void main(String[] args) {
        SingleObject obj = SingleObject.getInstance();

        obj.showMessage();
    }
}
