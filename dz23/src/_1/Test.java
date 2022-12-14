package _1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Очередь: ");
        ArrayQueue queue = new ArrayQueue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);//Заполняем добавляя в конец
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.dequeue());//Вынимаем и удаляем
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            queue.push(i);//Заполняем добавляя в начало
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.dequeue());
        }
        System.out.println("==============");
        System.out.println("ArrayQueueADT: ");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queueADT, i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueADT.dequeue(queueADT));
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.push(queueADT, i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueADT.dequeue(queueADT));
        }
        System.out.println("==============");
        System.out.println("ArrayQueueModule: ");
        ArrayQueueModule queueModule = new ArrayQueueModule();
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueModule.dequeue());
        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayQueueModule.dequeue());
        }
    }
}
