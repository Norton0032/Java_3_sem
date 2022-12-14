package _3;

import java.text.DateFormat;
import java.util.Calendar;
public class StudentWithBirthday {
    private Calendar birthday;
    private String name;
    private String surname;
    private int course;
    private String group;
    private double GPA;
    public StudentWithBirthday(String name, String surname, int course, String group, double GPA, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public String toString(DateFormat dateFormat) {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", course=" + getCourse() +
                ", group=" + getGroup() +
                ", GPA=" + getGPA() +
                ", birthday=" + dateFormat.format(birthday.getTime()) +
                '}';
    }
}