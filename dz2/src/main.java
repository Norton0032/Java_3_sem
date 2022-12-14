import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //№1
        int len = scanner.nextInt();
        int start = scanner.nextInt();
        int i = 2;
        int last = 0;
        int next = 1;
        if (start == 1) System.out.println(last);
        while (i != len + start) {
            if (i >= start) System.out.println(next);
            int z = next;
            next = last + next;
            last = z;
            i++;
        }
        //№2
        System.out.print("Введите длину: ");
        len = scanner.nextInt();
        ArrayList<Integer> vec = new ArrayList<>();
        System.out.print("Исходный массив: ");
        for (i = 0; i < len; i++) {
            vec.add((int) (Math.random() * 100));
        }
        System.out.println(vec);
        System.out.println(" Количество элементов: " + len);
        System.out.print("Введите число для удаления: ");
        int z = scanner.nextInt();
        while (vec.remove(Integer.valueOf(z))) {
        };
        len = vec.size();
        System.out.print("Новый массив: ");
        System.out.println(vec);
        System.out.println(" Количество элементов: " + len);
        System.out.print("Введите число от 0 до  9: ");
        z = scanner.nextInt();
        for (i = 0; i < vec.size(); i++) {
            if (vec.get(i) % 10 == z) {
                vec.remove(i);
                i--;
                len--;
            }
        }
        System.out.print("Новый массив: ");
        System.out.println(vec);
        System.out.println(" Количество элементов: " + len);
        //№3
        System.out.print("Введите число в 10-ой системе счисления: ");
        double x = scanner.nextDouble();
        System.out.print("Введите новую систему счисления: ");
        int s = scanner.nextInt();
        String a = per(x, s);
        String b = per(x, 2);
        String d = per(x, 16);
        System.out.println("В " + s + "-ой системе: " + a);
        System.out.println("В 2-ой системе: " + b);
        System.out.println("В 16-ой системе: " + d);
    }

    public static String per(double x, int s) {
        int c = (int) x;
        x = x - c;
        String a = "";
        String[] alf = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        while (c != 0) {
            a = alf[(c % s)] + a;
            c /= s;
        }
        a += ".";
        if (a.charAt(0) == '.') a = "0" + a;
        for (int i = 0; i < 3; i++) {
            x = x * s;
            a = a + alf[(int) (x)];
            x = x - (int) x;
        }
        return a;
    }
}