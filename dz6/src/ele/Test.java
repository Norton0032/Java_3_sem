package ele;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Transform t = new Transform();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в цельсия");
        double a = scanner.nextDouble();
        t.convert(a);
    }
}
