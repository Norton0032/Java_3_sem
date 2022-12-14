package two;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите начальные кординаты точкек x и y для 2 точек(вначале для верхней левой) и скорость смещения точек(по 1 числу на точку): ");
        int x1,y1,x2,y2,s1,s2;
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        s1 = scanner.nextInt();
        s2 = scanner.nextInt();
        MovebleRectangle a = new MovebleRectangle(x1,y1,x2,y2,s1,s2);
        System.out.println(a.toString());
        a.MoveRight();
        a.MoveUp();
        System.out.println(a.toString());
        a.MoveDown();
        a.MoveLeft();
        System.out.println(a.toString());
    }

}
