
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class ListNode implements Serializable {
    public ListNode next;
    public ListNode prev;
    public MenuItem item;

    public ListNode(MenuItem item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return Objects.equals(item, listNode.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item);
    }
}


public class InternetOrder implements Order, Serializable {
    private int size;
    private ListNode head = null;
    private ListNode tail = null;
    private Customer customer = null;

    public InternetOrder(ArrayList<MenuItem> items) {
        for (var item : items) {
            add(item);
        }
    }

    public InternetOrder() {
        this.size = 0;
    }

    @Override
    public boolean add(MenuItem item) {
        if (item == null) return false;
        if (head == null) {
            head = new ListNode(item);
            tail = head;
        } else {
            ListNode node = new ListNode(item);
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public ArrayList<String> itemsNames() {
        Set<String> names = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            names.add(node.item.getName());
            node = node.next;
        }
        return new ArrayList<>(names);
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            if (itemName.equals(node.item.getName())) count++;
            node = node.next;
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            if (item.getName().equals(node.item.getName())
                    && item.getDescription().equals(node.item.getDescription())
                    && item.getCost() == node.item.getCost()) count++;
            node = node.next;
        }
        return count;
    }

    @Override
    public ArrayList<MenuItem> getItems() {
        ArrayList<MenuItem> items = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            items.add(node.item);
            node = node.next;
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode node = head;
        while (node != null) {
            if (itemName.equals(node.item.getName())) {
                if (node.prev != null) node.prev.next = node.next;
                else head = node.next;
                if (node.next != null) node.next.prev = node.prev;
                else tail = node.prev;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode node = head;
        while (node != null) {
            if (item.getName().equals(node.item.getName())
                    && item.getDescription().equals(node.item.getDescription())
                    && item.getCost() == node.item.getCost()) {
                if (node.prev != null) node.prev.next = node.next;
                else head = node.next;
                if (node.next != null) node.next.prev = node.prev;
                else tail = node.prev;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            if (itemName.equals(node.item.getName())) {
                if (node.prev != null) node.prev.next = node.next;
                else head = node.next;
                if (node.next != null) node.next.prev = node.prev;
                else tail = node.prev;
                count++;
            }
            node = node.next;
        }
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            if (item.getName().equals(node.item.getName())
                    && item.getDescription().equals(node.item.getDescription())
                    && item.getCost() == node.item.getCost()) {
                if (node.prev != null) node.prev.next = node.next;
                else head = node.next;
                if (node.next != null) node.next.prev = node.prev;
                else tail = node.prev;
                count++;
            }
            node = node.next;
        }
        return count;
    }

    @Override
    public ArrayList<MenuItem> sortedItemsByCostDesc() {
        ArrayList<MenuItem> items = getItems();
        items.sort((o1, o2) -> o2.getCost() - o1.getCost());
        return items;
    }

    @Override
    public int costTotal() {
        int cost = 0;
        ListNode node = head;
        while (node != null) {
            cost += node.item.getCost();
            node = node.next;
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InternetOrder that = (InternetOrder) o;
        return size == that.size && Objects.equals(head, that.head) && Objects.equals(tail, that.tail) && Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, head, tail, customer);
    }
}
