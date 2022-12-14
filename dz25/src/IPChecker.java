
import java.util.Scanner;
import java.util.regex.Pattern;

public class IPChecker {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ip = scanner.nextLine();
        var regex = "^(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5]))\\.){3}(((1?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5])))$";
        System.out.println((Pattern.matches(regex, ip)) ? "IP верен" : "IP неверного формата");
        String ip2 = "255.255.255.0";
        System.out.println((Pattern.matches(regex, ip2)) ? "IP верен" : "IP неверного формата");
        String ip3 = "1300.6.7.8";
        System.out.println((Pattern.matches(regex, ip3)) ? "IP верен" : "IP неверного формата");
    }
}
