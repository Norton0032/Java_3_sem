package three;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        To_Str st = new To_Str(a);
        System.out.println(st.toString());
    }
}
