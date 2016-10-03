package facade;

public class CartesianPoint {
    private double x, y;

    public CartesianPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String toString() {
        return "(" + x + " , " + y + ")";
    }
}