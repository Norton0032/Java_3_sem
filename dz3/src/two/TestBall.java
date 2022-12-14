package two;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ball a1 = new Ball();
        Ball a2 = new Ball(1.0,1.0);
        System.out.println("X - "+a1.getX()+"\nY - "+a1.getY());
        System.out.println(a2.toString()+"\n Введите x и y: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        a1.setX(x);
        a1.setY(y);
        System.out.println(a1.toString()+"Введите x и y: ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        a1.setXY(x, y);
        System.out.println(a1.toString()+"Введите перемещение на x и y: ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        a1.move(x,y);
        System.out.println(a1.toString());
    }
}
