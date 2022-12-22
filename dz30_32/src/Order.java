
import java.util.ArrayList;

public interface Order {
    public boolean add(MenuItem item);
    public ArrayList<String>itemsNames();
    public int itemsQuantity();
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public ArrayList<MenuItem> getItems();
    public boolean remove(String itemName);
    public boolean remove(MenuItem item);
    public int removeAll(String itemName);
    public int removeAll(MenuItem item);
    public ArrayList<MenuItem> sortedItemsByCostDesc();
    public int costTotal();
    public Customer getCustomer();
    public void setCustomer(Customer customer);

    Customer customer = null;
}
