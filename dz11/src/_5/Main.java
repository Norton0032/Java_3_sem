package _5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 100000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        arrayList.add(12345);
        System.out.println("Вставка в ArrayList: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        arrayList.add(50000, 12345);
        System.out.println("Вставка в ArrayList по индексу: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        arrayList.remove(50000);
        System.out.println("Удаление из ArrayList по индексу: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        arrayList.indexOf(50000);
        System.out.println("Получение по индексу из ArrayList: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        linkedList.add(12345);
        System.out.println("\nВставка в LinkedList: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        linkedList.add(50000, 12345);
        System.out.println("Вставка в LinkedList по индексу: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        linkedList.remove(50000);
        System.out.println("Удаление из LinkedList по индексу: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        linkedList.indexOf(50000);
        System.out.println("Получение по индексу из LinkedList: " + (System.nanoTime() - start) + " ns");
    }
}
