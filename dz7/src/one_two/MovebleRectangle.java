package one_two;

public class MovebleRectangle implements Moveble{
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected int xSpeed;
    protected int ySpeed;

    public MovebleRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2= x2;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovebleRectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void MoveUp() {
        y1+=ySpeed;
        y2+=ySpeed;
    }

    @Override
    public void MoveDown() {
        y1-=ySpeed;
        y2-=ySpeed;
    }

    @Override
    public void MoveRight() {
        x1+=ySpeed;
        x2+=ySpeed;
    }

    @Override
    public void MoveLeft() {
        x1-=ySpeed;
        x2-=ySpeed;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
}
