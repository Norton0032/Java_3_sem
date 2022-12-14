package five;

import one.Moveble;
import one.MoveblePoint;

public class MovebleCircle implements Moveble {
    private int radius;
    private MoveblePoint center;

    public MovebleCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        center = new MoveblePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "five.MovebleCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public void MoveUp() {
       center.MoveUp();
    }
    public void MoveDown() {
        center.MoveDown();
    }
    public void MoveRight() {
        center.MoveRight();
    }

    public void MoveLeft() {
        center.MoveLeft();
    }
}
