import java.util.Scanner;

import static java.lang.Math.max;

public class _17 {
    public static int f() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return max(n, f());
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите последовательность и программа определит максимум");
        System.out.println(f());
    }
}
