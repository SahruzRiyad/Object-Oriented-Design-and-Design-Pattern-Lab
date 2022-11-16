public class RoundedShapeFactory extends AbstractFactory{
    public IShape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle"))
            return new RoundedRectangle();
        else if(shapeType.equalsIgnoreCase("Square"))
            return new RoundedSquare();
        else 
            return null;
    }
}
