public abstract class ShapeDecorator implements IShape{
    public IShape decoratedShape;

    public ShapeDecorator(IShape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
