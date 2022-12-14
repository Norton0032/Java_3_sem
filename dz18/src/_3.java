import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Введите целочисленное число: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }  catch (Exception e) {
            System.out.println("Общее исключение");
        }
    }
}
