public class MediatorPatternDemo {
    
    public static void main(String[] args) {
        User user1 = new User("Akash");
        User user2 = new User("Dhrubo");

        user1.sendMessage("Hello! Dhrubo!");
        user2.sendMessage("Hi! Akash!");

    }
}
