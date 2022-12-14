package _4;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате <Год> <Месяц> <Число> <Часы> <Минуты>");

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        Date userDate = new Date();
        userDate.setYear(year - 1900);
        userDate.setMonth(month - 1);
        userDate.setDate(day);
        userDate.setHours(hour);
        userDate.setMinutes(minute);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.println("Введенныя дата: " + dateFormatter.format(userDate));

        Calendar userCalendar = Calendar.getInstance();
        userCalendar.set(Calendar.YEAR, year);
        userCalendar.set(Calendar.MONTH, month - 1);
        userCalendar.set(Calendar.DAY_OF_MONTH, day-1);
        if (hour>=0 && hour<13)  userCalendar.set(Calendar.HOUR, hour-12);
        else if(hour> 12) userCalendar.set(Calendar.HOUR, hour+12);
        userCalendar.set(Calendar.MINUTE, minute);

        SimpleDateFormat calFormatter = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        System.out.println("Через календарь: " + calFormatter.format(userCalendar.getTime()));

    }
}
