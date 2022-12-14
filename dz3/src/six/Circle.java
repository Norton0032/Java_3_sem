package six;

public class Circle {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getS(){
        return 3.14*r*r;
    }
    public double getL(){
        return 3.14*2*r;
    }
    public void sr(Circle a){
        if(a.getR()>this.getR()) System.out.println("Второй круг больше");
        else if(a.getR()==this.getR()) System.out.println("Окружности равны");
        else System.out.println("Первый круг больше");
    }
}
