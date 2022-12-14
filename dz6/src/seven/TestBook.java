package seven;

import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        System.out.println("Название книги, автора и год ихдания: ");
        Scanner scanner = new Scanner(System.in);
        String n,a,g;
        n = scanner.next();
        a = scanner.next();
        g = scanner.next();
        Book book = new Book(n,a,g);
        book.print();
    }
}
