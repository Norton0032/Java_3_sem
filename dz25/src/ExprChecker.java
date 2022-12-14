import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExprChecker {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(\\([^()]*(\\d+(\\+|\\-|\\*|/))*\\d*\\))(\\+|\\-|\\*/)?");
        Matcher m;
        var scanner = new Scanner(System.in);
        var s = scanner.nextLine();
        while ((m = p.matcher(s)).find())
            s = m.replaceAll("");//Замена последовательностей удовлетворяющих шаблону
        System.out.println((s.contains("(") || s.contains(")") ? "Неверное выражение" : "Верное выражение"));
    }
}