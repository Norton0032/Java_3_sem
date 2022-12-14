package one_two;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите начальные кординаты точек верхнего левого и нижнего правого углов и скорость смещения: ");
        int x1,y1,x2,y2,xs,ys,r;
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        xs = scanner.nextInt();
        ys = scanner.nextInt();
        MovebleRectangle a = new MovebleRectangle(x1,y1,x2,y2,xs,ys);
        System.out.println(a.toString());
        a.MoveRight();
        a.MoveUp();
        System.out.println(a.toString());
    }
}
