package seven;
import java.util.ArrayList;

public class polka {
    private ArrayList<Book> books = new ArrayList<>();
    private int n = 0;
    public polka() {
        Book b = new Book("Писатель 1","Книга 1.1",1900,10,1);
        books.add(b);
        b = new Book("Писатель 1","Книга 1.2",1905,12,28);
        books.add(b);
        b = new Book("Писатель 2","Книга 2.1",1910,3,20);
        books.add(b);
        b = new Book("Писатель 2","Книга 2.2",1890,4,9);
        books.add(b);
        b = new Book("Писатель 3","Книга 3.1",2000,10,2);
        books.add(b);
        b = new Book("Писатель 3","Книга 3.2",2000,4,5);
        books.add(b);
        b = new Book("Писатель 4","Книга 4.1",1956,11,11);
        books.add(b);
        n = books.size();
    }
    public void sort() {
        for (int i=0;i<books.size();i++)
            for (int j=i+1;j<books.size();j++) {
                if(books.get(i).getY()>books.get(j).getY()){
                  Book z = books.get(j);
                  books.set(j,books.get(i));
                  books.set(i,z);
                }
            }
    }
    public Book max(){
        int y = 0;
        Book z = new Book();
        for (int i=0;i<books.size();i++)
            if(books.get(i).getY()>y){
                y = books.get(i).getY();
                z = books.get(i);
            }
        int m =0;
        for (int i=0;i<books.size();i++)
            if(books.get(i).getY()==y && books.get(i).getM()>m){
                m = books.get(i).getY();
                z = books.get(i);
            }
        int d =0;
        for (int i=0;i<books.size();i++)
            if(books.get(i).getY()==y && books.get(i).getM()==m && books.get(i).getD()>d){
                d = books.get(i).getY();
                z = books.get(i);
            }
        return z;
    }
    public Book min(){
        int y = 10000;
        Book z = new Book();
        for (int i=0;i<books.size();i++)
            if(books.get(i).getY()<y){
                y = books.get(i).getY();
                z = books.get(i);
            }
        int m =13;
        for (int i=0;i<books.size();i++)
            if(books.get(i).getY()==y && books.get(i).getM()<m){
                m = books.get(i).getY();
                z = books.get(i);
            }
        int d =32;
        for (int i=0;i<books.size();i++)
            if(books.get(i).getY()==y && books.get(i).getM()==m && books.get(i).getD()<d){
                d = books.get(i).getY();
                z = books.get(i);
            }
        return z;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void print(){
        for(Book i: books){
            System.out.println(i.toString());
        }
    }
}
