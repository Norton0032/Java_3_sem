package one;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите начальные кординаты точки и скорость смещения: ");
        int x,y,xs,ys,r;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        xs = scanner.nextInt();
        ys = scanner.nextInt();
        MoveblePoint a = new MoveblePoint(x,y,xs,ys);
        System.out.println(a.toString());
        a.MoveRight();
        a.MoveUp();
        System.out.println(a.toString());
        System.out.println("Введите начальные кординаты центра окружности, скорость смещения и радиус: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        xs = scanner.nextInt();
        ys = scanner.nextInt();
        r = scanner.nextInt();
        MovebleCircle b = new MovebleCircle(x,y,xs,ys,r);
        System.out.println(b.toString());
        b.MoveDown();
        b.MoveLeft();
        System.out.println(b.toString());
    }

}
