public class StudentNotFoundException extends Exception{
    StudentNotFoundException(){
        super("Студент не найден");
    }
}