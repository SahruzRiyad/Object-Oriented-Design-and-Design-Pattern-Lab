public class DecoratorPatternDemo {
    public static void main(String[] args) {
        IShape circle = new Circle();
        IShape rectagnle = new Rectangle();

        IShape redCircle = new RedShapeDecorator(circle);
        IShape redRectangle = new RedShapeDecorator(rectagnle);

        System.out.println("Circle with Normal border");
        circle.draw();

        System.out.println("Cirlcle with Red Border:");
        redCircle.draw();

        System.out.println("Rectangle with Normal border");
        rectagnle.draw();

        System.out.println("Rectangle with Red Border:");
        redRectangle.draw();
    }   
}
