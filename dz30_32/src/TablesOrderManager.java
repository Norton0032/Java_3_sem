import java.io.Serializable;
import java.util.ArrayList;

public class TablesOrderManager implements Serializable,OrdersManager {
    private final ArrayList<Order> orders;

    public TablesOrderManager(int size) {
        orders = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            orders.add(null);
        }
    }

    public ArrayList<Integer> freeTableNumbers() {
        ArrayList<Integer> freeTables = new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) == null) freeTables.add(i);
        }
        return freeTables;
    }

    public int freeTableNumber() {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) == null) return i;
        }
        return -1;
    }

    public void add(Order order, int tableNumber) {
        ArrayList<Integer> freeTables = freeTableNumbers();
        if (freeTables.contains(tableNumber)) {
            orders.set(tableNumber, order);
        } else { //@TODO: throw exception
            System.out.println("Table is not free");
        }
    }

    public void addItem(MenuItem item, int tableNumber) {
        if (orders.get(tableNumber) != null) {
            orders.get(tableNumber).add(item);
        } else { //@TODO: throw exception
            System.out.println("Table is empty");
        }
    }

    public void remove(int tableNumber) {
        if (orders.get(tableNumber) != null) orders.set(tableNumber, null);
    }

    public int remove(Order order) {
        for (int i = 0; i < orders.size(); i++) {

            if (order.equals(orders.get(i))) {
                orders.set(i, null);
                return i;
            }
        }
        return -1;
    }

    public int removeAll(Order order) {
        int count = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (order.equals(orders.get(i))) {
                orders.set(i, null);
                count++;
            }
        }
        return count;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for (var order : orders) {
            if (order != null) count += order.itemsQuantity(itemName);
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for (var order : orders) {
            if (order != null) count += order.itemsQuantity(item);
        }
        return count;
    }

    @Override
    public ArrayList<Order> getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for (var order : orders) {
            if (order != null) cost += order.costTotal();
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        int count = 0;
        for (var order : orders) {
            if (order != null) count++;
        }
        return count;
    }
}
