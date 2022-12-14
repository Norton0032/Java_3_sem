package six;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle one = new Circle();
        Circle two = new Circle();
        System.out.println("Введите радиус 1 и 2 окружности: ");
        double a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        one.setR(a);
        two.setR(b);
        one.sr(two);
        System.out.println("Площадь 1 круга - "+one.getS()+ " Длина 1 круга - "+one.getL());
        System.out.println("Площадь 2 круга - "+two.getS()+ " Длина 2 круга - "+two.getL());
    }
}
