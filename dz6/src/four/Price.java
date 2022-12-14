package four;

public class Price implements Priceable {
    private String name;
    private int price;
    public Price(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
