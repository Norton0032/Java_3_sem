import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class TableOrder implements Serializable,Order {
    private int size;
    private ArrayList<MenuItem> items;

    private Customer customer;

    public TableOrder( ArrayList<MenuItem> items) {
        this.items = items;
    }
    public TableOrder() {
        items = new ArrayList<>();
    }

    @Override
    public boolean add(MenuItem item) {
        if (items.add(item)) {
            size++;
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<String> itemsNames() {
        Set<String> names = new HashSet<>();
        for(var item:items) names.add(item.getName());
        return new ArrayList<>(names);
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for(var item:items) {
            if (itemName.equals(item.getName())) count++;
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for(var i:items) {
            if (item.getName().equals(i.getName())
                    && item.getDescription().equals(i.getDescription())
                    && item.getCost() == i.getCost()) count++;
        }
        return count;
    }

    @Override
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        for(var item:items) {
            if (itemName.equals(item.getName())) {
                items.remove(item);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for(var i:items) {
            if (item.getName().equals(i.getName())
                    && item.getDescription().equals(i.getDescription())
                    && item.getCost() == i.getCost()) {
                items.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for(var item:items) {
            if (itemName.equals(item.getName())) {
                items.remove(item);
                count++;
                size--;
            }
        }
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        for(var i:items) {
            if (item.getName().equals(i.getName())
                    && item.getDescription().equals(i.getDescription())
                    && item.getCost() == i.getCost()) {
                items.remove(i);
                count++;
                size--;
            }
        }
        return count;
    }

    @Override
    public ArrayList<MenuItem> sortedItemsByCostDesc() {
        ArrayList<MenuItem> sorted = new ArrayList<>(items);
        sorted.sort((a, b) -> b.getCost() - a.getCost());
        return sorted;
    }

    @Override
    public int costTotal() {
        int cost = 0;
        for(var item:items) cost += item.getCost();
        return cost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
