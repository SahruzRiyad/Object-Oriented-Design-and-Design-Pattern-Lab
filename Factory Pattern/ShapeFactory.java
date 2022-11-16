public class ShapeFactory {
    public IShape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else 
            return null;
    }
}
