
import java.io.Serializable;
import java.util.ArrayList;

class QeueNode implements Serializable {
    public Order order;
    public QeueNode next = null;
    public QeueNode prev = null;
    public QeueNode(Order order){
        this.order = order;
    }
}
public class InternetOrdersManager implements Serializable, OrdersManager {
    private QeueNode head = null;
    private QeueNode tail = null;
    private int size = 0;

    public boolean add(Order order){
        if (order == null) return false;
        QeueNode node = new QeueNode(order);
        if (head == null){
            head = node;
        } else{
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        size++;
        return true;
    }

    public Order remove() {
        if (head == null) return null;
        QeueNode node = head;
        head = head.next;
        if (head == null) tail = null;
        else head.prev = null;
        size--;
        return node.order;
    }

    public Order getOrder() {
        if (head == null) return null;
        return head.order;
    }


    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QeueNode node = head;
        while (node != null){
            count += node.order.itemsQuantity(itemName);
            node = node.next;
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QeueNode node = head;
        while (node != null){
            count += node.order.itemsQuantity(item);
            node = node.next;
        }
        return count;
    }

    @Override
    public ArrayList<Order> getOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        QeueNode node = head;
        while (node != null){
            orders.add(node.order);
            node = node.next;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        QeueNode node = head;
        while (node != null){
            cost += node.order.costTotal();
            node = node.next;
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}
