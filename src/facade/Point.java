package facade;

public class Point {
    private CartesianPoint cartesianPoint;

    public Point(double x, double y){
        cartesianPoint = new CartesianPoint(x, y);
    }

    public void move(int dx, int dy){
        cartesianPoint.move(dx,dy);
    }

    public void rotate(int angle, Point point){
        double x = cartesianPoint.getX() - point.cartesianPoint.getX();
        double y = cartesianPoint.getY() - point.cartesianPoint.getY();
        PolarPoint polarPoint = new PolarPoint(Math.sqrt(x * x + y * y), Math.atan2(y,x) * 180 / Math.PI);
        polarPoint.rotate(angle);
        System.out.println(" PolarPoint is " + polarPoint);
        String string = polarPoint.toString();
        int i = string.indexOf('@');
        double r = Double.parseDouble(string.substring(1, i));
        double a = Double.parseDouble(string.substring(i+1, string.length()-1));
        cartesianPoint = new CartesianPoint(r*Math.cos(a*Math.PI/180) + point.cartesianPoint.getX(),
                r*Math.sin(a*Math.PI/180) + point.cartesianPoint.getY());
    }

    public String toString(){
        return cartesianPoint.toString();
    }
}
