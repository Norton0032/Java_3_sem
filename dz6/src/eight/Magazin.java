package eight;
import six.Printable;
public class Magazin implements Printable {
    private String name;

    public Magazin(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("Название магазина - " + name);
    }
}
