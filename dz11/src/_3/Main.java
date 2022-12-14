package _3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        StudentWithBirthday student = new StudentWithBirthday("Евгений",
                "Егоркин",
                2,
                "ИКБО-01-21",
                5,
                new java.util.GregorianCalendar(2003, Calendar.OCTOBER, 20));

        System.out.println(student.toString(SimpleDateFormat.getDateInstance(DateFormat.SHORT)));
        System.out.println(student.toString(SimpleDateFormat.getDateInstance(DateFormat.MEDIUM)));
        System.out.println(student.toString(SimpleDateFormat.getDateInstance(DateFormat.LONG)));
        System.out.println(student.toString(SimpleDateFormat.getDateInstance(DateFormat.FULL)));
    }
}
