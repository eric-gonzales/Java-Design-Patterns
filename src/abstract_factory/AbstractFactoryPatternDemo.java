package abstract_factory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        //get shape factory
        AbstractFactory shapeFactory = FactoryGenerator.getFactory("Shape");
        //get shape from shape factory
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        AbstractFactory colorFactory = FactoryGenerator.getFactory("Color");
        Color color1 = colorFactory.getColor("Red");
        color1.fill();
    }
}
