package nine;

import eight.Magazin;
import six.Printable;
import seven.Book;

import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<Printable> a = new ArrayList<>();
        Book book = new Book("Мартин Иден","Джек Лондон","1909");
        a.add(book);
        book = new Book("Бесы","Достоевский","1872");
        a.add(book);
        Magazin magazin = new Magazin("Журнал1");
        a.add(magazin);
        magazin = new Magazin("Журнал2");
        a.add(magazin);
        for(int i =0;i<a.size();++i){
            a.get(i).print();
        }
    }
}
