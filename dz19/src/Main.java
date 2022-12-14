import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        model.setArray(fill());
        new GUI(model);
    }
    static ArrayList <Student> fill(){
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student("Александр Л", 2, 208));
        array.add(new Student("Евгений Е", 4, 278));
        array.add(new Student("Кирилл М", 1, 298));
        array.add(new Student("Полина Г", 3, 270));
        array.add(new Student("Андрей П", 2, 178));
        return array;
    }
}