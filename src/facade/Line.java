package facade;

public class Line {
    private Point origin, end;
    public Line(Point origin, Point end){
        this.origin = origin;
        this.end = end;
    }
    public void move(int dx, int dy){
        origin.move(dx,dy);
        end.move(dx,dy);
    }
    public void rotate(int angle){
        end.rotate(angle, origin);
    }
    public String toString(){
        return "Origin is " + origin + ", and end is " + end;
    }
}
