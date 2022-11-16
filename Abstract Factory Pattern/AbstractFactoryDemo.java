public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        
        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("Square").draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        roundedShapeFactory.getShape("Rectangle").draw();
        roundedShapeFactory.getShape("Square").draw();
    }
}
