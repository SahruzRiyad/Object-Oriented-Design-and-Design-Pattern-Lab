public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(IShape decoratedShape){
        super(decoratedShape);
    }
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(IShape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
