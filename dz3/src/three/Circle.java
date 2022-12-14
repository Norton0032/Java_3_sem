package three;

public class Circle {
    Point center;
    double r;
    Circle(Point с, double r){
        center = с;
        this.r = r;
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", r=" + r +
                '}';
    }
}
