import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.println("Введите строку для разбиения: ");
        String task1String = scanner.nextLine();
        System.out.println(task1(task1String));

        System.out.println("\nЗадание 2");
        String task2String1 = "abcdefghijklmnopqrstuv18340";
        String task2String2 = "dfdgdf";
        System.out.printf("Является ли строка %s строкой %s?: %s\n", task2String1, task2String1, task2(task2String1));
        System.out.printf("Является ли строка %s строкой %s?: %s\n", task2String2, task2String1, task2(task2String2));

        System.out.println("\nЗадание 3");
        String task3String = "25.98 RUB";
        String task3String2 = "0.004 RRRR";
        System.out.printf("Корректна ли строка %s?: %s\n", task3String, task3(task3String));
        System.out.printf("Корректна ли строка %s?: %s\n", task3String2, task3(task3String2));

        System.out.println("\nЗадание 4");
        String task4String = "(1 + 8) - 9 / 4";
        String task4String2 = "6 / 5 - 2 * 9";
        System.out.printf("Есть ли в тексте %s цифры, за которыми стоит '+'?: %s\n", task4String, task4(task4String));
        System.out.printf("Есть ли в тексте %s цифры, за которыми стоит '+'?: %s\n", task4String2, task4(task4String2));

        System.out.println("\nЗадание 7");
        String task7String1 = "F032_Password";
        String task7String2 = "smart_pass3";
        System.out.printf("Строка %s - надежный пароль?: %s\n", task7String1, task7(task7String1));
        System.out.printf("Строка %s - надеждный пароль?: %s\n", task7String2, task7(task7String2));
    }

    public static ArrayList<String> task1(String str){
        return new ArrayList<>(Arrays.asList(str.split(" ")));
    }

    public static boolean task2(String str){
        return str.matches("abcdefghijklmnopqrstuv18340");
    }

    public static boolean task3(String str){
        return str.matches("^[0-9]{1,}.[0-9]{1,2}\\s(USD|RUB|EU)"); //В начале строки цифра n раз и более любой символ
    }                                       //цифра от 1 до 2 раз пробел и любой из


    public static boolean task4(String str){
        return str.matches(".*(\\+)\\s*[0-9]{1,}.*");//любой символ любое количество раз + и цифра
    }


    public static boolean task7(String str){
        return str.matches("^.*(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*");//8 символов
    }                                           //маленькая, большая и цифра

}