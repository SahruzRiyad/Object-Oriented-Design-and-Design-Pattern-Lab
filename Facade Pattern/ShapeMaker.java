public class ShapeMaker {
    private IShape circle;
    private IShape rectangle;
    private IShape square;

    public ShapeMaker(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}