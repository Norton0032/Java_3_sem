package seven;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println("Введите автора, название книги, год, месяц и день написания ");
        Scanner scan = new Scanner(System.in);
        String au,name;
        int y,m,d;
        au = scan.next();
        name = scan.next();
        y = scan.nextInt();
        m = scan.nextInt();
        d = scan.nextInt();
        b.setAuthor(au);
        b.setD(d);
        b.setY(y);
        b.setM(m);
        b.setName(name);
        System.out.println("Автор " + b.getAuthor()+ " Название - "+b.getName()+ " Год написания - "+b.getY()+" Месяц написания - "+b.getM()+" День написания - "+b.getD());
        polka p =new polka();
        p.print();
        System.out.println("Самая поздняя книга: ");
        System.out.println(p.max().toString());
        System.out.println("Самая ранняя книга: ");
        System.out.println(p.min().toString()+"\n");
        p.sort();
        p.print();
    }
}
