package _5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneNumber phoneNumber1 = new PhoneNumber("+79175655655");
        System.out.println(phoneNumber1);

        PhoneNumber phoneNumber2 = new PhoneNumber("89175655655");
        System.out.println(phoneNumber2);
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        PhoneNumber phoneNumber3 = new PhoneNumber(a);
        System.out.println(phoneNumber3);
    }
}
