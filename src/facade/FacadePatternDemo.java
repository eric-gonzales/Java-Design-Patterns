package facade;

public class FacadePatternDemo {
    public static void main(String[] args){
        Line line = new Line(new Point(2,4), new Point(5,7));
        line.move(-2,-1);
        System.out.println("After move: " + line);
        line.rotate(45);
        System.out.println("After rotate: " + line);
        Line line2 = new Line(new Point(2,1), new Point(2.866,1.5));
        line2.rotate(30);
        System.out.println("30 degrees to 60 degrees: " + line2);
    }
}
