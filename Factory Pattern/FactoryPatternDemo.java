public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape circle = shapeFactory.getShape("Circle");
        IShape rectangle = shapeFactory.getShape("rectangle");
        IShape square = shapeFactory.getShape("square");

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
