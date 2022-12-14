package four;

public class TestPrice {
    public static void main(String[] args) {
        Price a = new Price("Car",1000000);
        Price b = new Price("Animal",10000);
        Price c = new Price("Home",50000000);
        System.out.println(a.getName()+" - "+a.getPrice()+"\n"+b.getName()+" - "+b.getPrice()+"\n"+c.getName()+" - "+c.getPrice());
    }
}
