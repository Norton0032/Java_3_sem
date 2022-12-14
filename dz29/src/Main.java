
public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        Order restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(new Dish(100, "Тарелка", ")"));
        restaurantOrder.add(new Dish(70, "Кружка", ")"));
        restaurantOrder.add(new Drink(400, "Кофе", ")"));
        restaurantOrder.add(new Drink(300, "Яблочный сок", "("));
        int table = 10;

        System.out.println("Заказ к столу №" + table + ":");
        for (Item item : restaurantOrder.getSortedArray()) {
            System.out.println(item.getName() + " - " + item.getCost() + " руб." + " - " + item.getDescription());
        }
        System.out.println("Количество позиций в заказе: " + restaurantOrder.getCount());
        System.out.println("Стоимость заказа: " + restaurantOrder.getCost() + " руб.");

        try {
            orderManager.add(restaurantOrder, table);
            System.out.println("Заказ к столу №" + table + " добавлен в систему");
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");

        Order internetOrder = new InternetOrder();
        internetOrder.add(new Dish(70, "Тарелка", "Лучшие"));
        internetOrder.add(new Drink(500, "Чай", ")"));
        String address = "ул. Куйбышева, д. 1";

        System.out.println("Интернет заказ по адресу " + address + ":");
        for (Item item : internetOrder.getSortedArray()) {
            System.out.println(item.getName() + " - " + item.getCost() + " руб." + " - " + item.getDescription());
        }
        System.out.println("Количество позиций в заказе: " + internetOrder.getCount());
        System.out.println("Стоимость заказа: " + internetOrder.getCost() + " руб.");

        try {
            orderManager.add(internetOrder, address);
            System.out.println("Интернет заказ по адресу " + address + " добавлен в систему");
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------");

        // Пробуем добавить заказ к столу №4, который уже есть в системе
        try {
            orderManager.add(restaurantOrder, table);
            System.out.println("Заказ к столу №" + table + " добавлен в систему");
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }

    }
}
