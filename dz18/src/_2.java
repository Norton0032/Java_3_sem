import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Введите целочисленное число: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch(NumberFormatException e){
            System.out.println("Число не целочисленное");
        } catch ( ArithmeticException e ) {
            System.out.println("Нельзя делить на 0");
        }
    }
}
