package seven;
import six.Printable;
public class Book implements Printable {
    private String name;
    private String author;
    private String year;
    public Book(String name, String author, String year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %s году \n", name, author, year);
    }
}
