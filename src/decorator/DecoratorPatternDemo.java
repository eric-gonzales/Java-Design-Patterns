package decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape square = new Square();
        Shape redSquare = new RedShapeDecorator(new Square());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        square.draw();
        redSquare.draw();
        redRectangle.draw();
    }
}
