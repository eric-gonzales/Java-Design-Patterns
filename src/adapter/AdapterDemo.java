package adapter;

public class AdapterDemo {
    public static void main(String[] args){
        Shape[] shapes = { new Line(), new Rectangle() };
        int x1 = 10, y1 = 10;
        int x2 = 55, y2 = 66;
        for(int i = 0; i < shapes.length; ++i){
            shapes[i].draw(x1, y1, x2, y2);
        }
    }
}
