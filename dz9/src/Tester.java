import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> students = setArray(7);
        System.out.println("До сортировки:");
        outArray(students);
        System.out.println("\nПосле сортировки по GPA вставками:");
        SortAlgorithms.selectionSort(students);
        outArray(students);

        System.out.println("\nПосле сортировки по именам вставками:");
        SortAlgorithms.selectionSort(students, Comparator.comparing(Student::getName));
        outArray(students);

        System.out.println("\nПосле быстрой сортировки по GPA:");
        SortAlgorithms.quickSort(students, 0, students.size() - 1);
        outArray(students);

        System.out.println("\nПосле быстрой сортировки по имени:");
        SortAlgorithms.quickSort(students, 0, students.size() - 1, Comparator.comparing(Student::getName));
        outArray(students);

        System.out.println("\nПосле mergeSort по GPA:");
        SortAlgorithms.mergeSort(students, 0, students.size() - 1);
        outArray(students);

        System.out.println("\nПосле mergeSort по именам:");
        SortAlgorithms.mergeSort(students, 0, students.size() - 1, Comparator.comparing(Student::getName));
        outArray(students);
    }

    public static ArrayList<Student> setArray(int n) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student("Name " + i,
                    "Surname " + i,
                    "Specialization " + i,
                    i,
                    "Group " + i,
                    BigDecimal.valueOf(Math.random() * 100)
                            .setScale(2, RoundingMode.HALF_UP)
                            .doubleValue()));
        }
        return students;
    }

    public static void outArray(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}