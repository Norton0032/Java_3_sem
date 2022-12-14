package seven;

public class Book {
    private String author;
    private String name;
    private int y;
    private int m;
    private int d;

    public Book(String author, String name, int y, int m, int d) {
        this.author = author;
        this.name = name;
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", y=" + y +
                ", m=" + m +
                ", d=" + d +
                '}';
    }
}
