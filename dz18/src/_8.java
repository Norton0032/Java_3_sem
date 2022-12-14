import java.util.Scanner;

public class _8 {
    public static void getKey() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String key = scanner.next();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Введите еще раз");
            }
        }
    }
    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (Exception e) {
            throw e;
        }
    }
    private static String getDetails(String key) throws Exception {
        if (key.equals("null")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}
