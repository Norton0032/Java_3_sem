import java.util.ArrayList;

public interface Order {
    boolean add(Item item);

    boolean remove(String name);

    int removeAll(String name);

    int getCount();

    ArrayList<Item> getArray();

    int getCost();

    int getAmount(String name);

    ArrayList<Item> getSortedArray();

    String[] getMenu();
}
