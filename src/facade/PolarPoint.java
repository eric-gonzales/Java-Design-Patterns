package facade;

public class PolarPoint {
    private double radius, angle;

    public PolarPoint(double radius, double angle){
        this.radius = radius;
        this.angle = angle;
    }

    public void rotate(int angle){
        this.angle += angle % 360;
    }

    public String toString(){
        return "[" + radius + "@" + angle + "]";
    }
}
