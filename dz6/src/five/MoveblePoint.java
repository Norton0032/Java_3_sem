package five;

import one.Moveble;

public class MoveblePoint implements Moveble {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MoveblePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "five.MoveblePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void MoveUp() {
        y+=ySpeed;
    }

    @Override
    public void MoveDown() {
        y-=ySpeed;
    }

    @Override
    public void MoveRight() {
        x+=xSpeed;
    }

    @Override
    public void MoveLeft() {
        x-=xSpeed;
    }
}
