package four;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действительную и мнимую часть");
        double d = scanner.nextDouble();
        double m = scanner.nextDouble();
        MathFunc a = new MathFunc(d,m);
        a.toString();
        int s;
        s = scanner.nextInt();
        System.out.println("Комплексное число в указанной степени = "+a.sqr(s));
        System.out.println("Модуль = "+a.mod());
    }
}
