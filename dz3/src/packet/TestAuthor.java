package packet;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Author a1 = new Author("Mike","aaaaaaaa@mail.ru",'M');
        System.out.println("Имя - "+a1.getName()+"\nПочта - "+a1.getEmail()+"\nПол - "+a1.getGender()+"\nВведите почту: ");
        String p = scan.next();
        a1.setEmail(p);
        System.out.println(a1.toString());
    }
}
