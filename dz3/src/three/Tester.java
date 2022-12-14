package three;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Введите кординаты цента окружности: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        Point c = new Point(x,y);
        System.out.println("Введите радиус: ");
        x = scan.nextDouble();
        Circle o = new Circle(c,x);
        System.out.println("Кординаты x и y: "+o.getCenter().getX()+" "+o.getCenter().getY()+"\nВведите радиус: ");
        x = scan.nextDouble();
        o.setR(x);
        ArrayList<Circle> cir = new ArrayList<>();
        cir.add(o);
        Circle o1 = new Circle(c,10.1);
        cir.add(o1);
        for(int i=0;i<cir.size();i++){
            System.out.println(cir.get(i).toString());
        }
    }
}
