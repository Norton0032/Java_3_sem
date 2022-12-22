
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Driver{
    JFrame frame = new JFrame("Order Manager");
    JPanel buttonPanel = new JPanel();
    JPanel internetOrdersPanel = new JPanel();
    JPanel tableOrdersPanel = new JPanel();

    InternetOrdersManager internetOrdersManager = new InternetOrdersManager();
    TablesOrderManager tablesOrderManager = new TablesOrderManager(10);
    public Driver() {

        //настроили экран, расположили по центру
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setLayout(new GridLayout(1, 3,20, 10));

        frame.add(buttonPanel);


        //настроили панель с кнопками
        SpringLayout layout = new SpringLayout();
        buttonPanel.setLayout(layout);
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 7));

        JLabel label = new JLabel("Options");
        label.setFont(new Font("Arial", Font.BOLD, 20));

        JButton addOrderButton = new JButton("Add Internet Order");
        addOrderButton.setPreferredSize(new Dimension(200, 50));

        addOrderButton.addActionListener(e -> {
            InternetOrder order = new InternetOrder(getOrder());
            internetOrdersManager.add(order);
            refreshFrame();

        });

        JButton addTableOrderButton = new JButton("Add Table Order");
        addTableOrderButton.setPreferredSize(new Dimension(200, 50));
        addTableOrderButton.addActionListener(e -> {

            TableOrder order = new TableOrder(getOrder());
            tablesOrderManager.add(order, tablesOrderManager.freeTableNumber());
            refreshFrame();

        });


        JButton removeOrderButton = new JButton("Remove Order");
        removeOrderButton.setPreferredSize(new Dimension(200, 50));
        removeOrderButton.addActionListener(e -> {
            internetOrdersManager.remove();
            refreshFrame();
        });

        JButton saveOrdersButton = new JButton("Save Orders");
        saveOrdersButton.setPreferredSize(new Dimension(200, 50));
        saveOrdersButton.addActionListener(e-> {
            try {
                FileOutputStream outputStream = new FileOutputStream("orders.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(internetOrdersManager);
                objectOutputStream.writeObject(tablesOrderManager);
                int result = JOptionPane.showConfirmDialog(null, "Object saved", "Success", JOptionPane.OK_OPTION);
                frame.remove(internetOrdersPanel);
                frame.remove(tableOrdersPanel);

                frame.revalidate();
                frame.repaint();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton loadOrdersButton = new JButton("Load Orders");
        loadOrdersButton.setPreferredSize(new Dimension(200, 50));
        loadOrdersButton.addActionListener(e-> {
            try {
                FileInputStream inputStream = new FileInputStream("orders.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                internetOrdersManager = (InternetOrdersManager) objectInputStream.readObject();
                refreshFrame();
                tablesOrderManager = (TablesOrderManager) objectInputStream.readObject();
                refreshFrame();
            } catch (IOException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });

        layout.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, buttonPanel);
        layout.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, buttonPanel);

        layout.putConstraint(SpringLayout.WEST, addOrderButton, 25, SpringLayout.WEST, buttonPanel);
        layout.putConstraint(SpringLayout.NORTH, addOrderButton, 10, SpringLayout.SOUTH, label);

        layout.putConstraint(SpringLayout.WEST, addTableOrderButton, 25, SpringLayout.WEST, buttonPanel);
        layout.putConstraint(SpringLayout.NORTH, addTableOrderButton, 10, SpringLayout.SOUTH, addOrderButton);

       layout.putConstraint(SpringLayout.WEST,  removeOrderButton, 25, SpringLayout.WEST, buttonPanel);
       layout.putConstraint(SpringLayout.NORTH,  removeOrderButton, 30, SpringLayout.SOUTH, addTableOrderButton);



        layout.putConstraint(SpringLayout.WEST, saveOrdersButton, 25, SpringLayout.WEST, buttonPanel);
        layout.putConstraint(SpringLayout.NORTH, saveOrdersButton, 80, SpringLayout.SOUTH, removeOrderButton);

        layout.putConstraint(SpringLayout.WEST, loadOrdersButton, 25, SpringLayout.WEST, buttonPanel);
        layout.putConstraint(SpringLayout.NORTH, loadOrdersButton, 10, SpringLayout.SOUTH, saveOrdersButton);


        buttonPanel.add(label);
        buttonPanel.add(addOrderButton);
        buttonPanel.add(addTableOrderButton);

        buttonPanel.add(removeOrderButton);
        buttonPanel.add(saveOrdersButton);
        buttonPanel.add(loadOrdersButton);

        //настроили панель с интернет заказами
        internetOrdersPanel = getOrderPanel("Internet Orders", internetOrdersManager);
        frame.add(internetOrdersPanel);

        //настроили панель с заказами на столиках
        tableOrdersPanel = getOrderPanel("Table Orders", tablesOrderManager);
        frame.add(tableOrdersPanel);

        frame.setVisible(true);
    }

    private void refreshFrame() {
        frame.remove(internetOrdersPanel);
        frame.remove(tableOrdersPanel);

        internetOrdersPanel = getOrderPanel("Internet Orders", internetOrdersManager);
        tableOrdersPanel = getOrderPanel("Table Orders", tablesOrderManager);
        frame.add(internetOrdersPanel);
        frame.add(tableOrdersPanel);

        frame.revalidate();
        frame.repaint();
    }

    private ArrayList<MenuItem> getOrder() {
        int result = JOptionPane.showConfirmDialog(null, "Do you want to add a drink?", "Add drink", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            return getDrinks(new ArrayList<MenuItem>());
        } else {
            return getDishes(new ArrayList<MenuItem>());
        }
    }

    private ArrayList<MenuItem> getDishes(ArrayList<MenuItem> items) {
        String[] dishTypes = new String[]{"Pizza", "Burger", "Salad"};
        JTextField name = new JTextField();
        JTextField address = new JTextField();
        JTextField description = new JTextField();
        JLabel price = new JLabel(String.valueOf(ThreadLocalRandom.current().nextInt(10, 100 + 1)));
        JComboBox<String> dishType = new JComboBox<>(dishTypes);

        Object[] message = {
                "Name:", name,
                "Address:", address,
                "Description:", description,
                "Price:", price,
                "Dish type:", dishType,
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Add dish", JOptionPane.OK_CANCEL_OPTION);
        while(option != JOptionPane.CANCEL_OPTION) {


            items.add(new Dish(Integer.parseInt(price.getText()),
                    name.getText(), description.getText()));
            name.setText("");
            address.setText("");
            description.setText("");
            Integer new_price = ThreadLocalRandom.current().nextInt(10, 100 + 1);
            price.setText(String.valueOf(new_price));
            option = JOptionPane.showConfirmDialog(null, message, "Add dish", JOptionPane.OK_CANCEL_OPTION);

        }
        int result = JOptionPane.showConfirmDialog(null, "Do you want to add a drink?", "Add drink", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            return getDrinks(items);
        } else {
            return items;
        }

    }

    private ArrayList<MenuItem> getDrinks(ArrayList<MenuItem> items) {
        String[] drinkTypes = new String[DrinkTypeEnum.values().length];
        for (int i = 0; i < DrinkTypeEnum.values().length; i++) {
            drinkTypes[i] = DrinkTypeEnum.values()[i].toString();
        }

        JTextField name = new JTextField();
        JTextField address = new JTextField();
        JTextField description = new JTextField();
        JComboBox<String> drinkType = new JComboBox<>(drinkTypes);
        JLabel price = new JLabel(String.valueOf(ThreadLocalRandom.current().nextInt(10, 100 + 1)));
        Object[] message = {
                "Name:", name,
                "Address:", address,
                "Description:", description,
                "Price:", price,
                "Drink type:", drinkType,
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Add drink", JOptionPane.OK_CANCEL_OPTION);
        while(option != JOptionPane.CANCEL_OPTION) {

            price = new JLabel(String.valueOf(ThreadLocalRandom.current().nextInt(10, 100 + 1)));
            items.add(new Drink(Integer.parseInt(price.getText()),
                    name.getText(), description.getText(),
                    DrinkTypeEnum.valueOf(drinkType.getSelectedItem().toString()), 0));
            name.setText("");
            address.setText("");
            description.setText("");
            option = JOptionPane.showConfirmDialog(null, message, "Add drink", JOptionPane.OK_CANCEL_OPTION);

        }
        int result = JOptionPane.showConfirmDialog(null, "Do you want to add a dish?", "Add dish", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            return getDishes(items);
        } else {
            return items;
        }
    }

    private JPanel getOrderPanel(String internet_orders, OrdersManager internetOrdersManager) {
        SpringLayout ordersLayout = new SpringLayout();
        JPanel ordersPanel = new JPanel(ordersLayout); //панель с заказами

        //панель с текстом
        JPanel ordersLabelPanel = new JPanel(); //хранит название панели
        ordersLabelPanel.setLayout(new BorderLayout());
        JLabel ordersLabel = new JLabel(internet_orders);
        ordersLabel.setFont(new Font("Arial", Font.BOLD, 20));
        ordersLabelPanel.add(ordersLabel, BorderLayout.CENTER);
        ordersPanel.add(ordersLabelPanel);
        ordersLayout.putConstraint(SpringLayout.WEST, ordersLabelPanel, 40, SpringLayout.WEST, internetOrdersPanel);
        ordersLayout.putConstraint(SpringLayout.NORTH, ordersLabelPanel, 10, SpringLayout.NORTH, internetOrdersPanel);


        //настроили панель с заказами
        JPanel ordersListPanel = getOrdersListPanel(internetOrdersManager);
        ordersPanel.add(ordersListPanel);
        ordersLayout.putConstraint(SpringLayout.WEST, ordersListPanel, 40, SpringLayout.WEST, ordersPanel);
        ordersLayout.putConstraint(SpringLayout.NORTH, ordersListPanel, 10, SpringLayout.SOUTH, ordersLabelPanel);


        //настроили панель с общей суммой заказа
        JLabel totalLabel = new JLabel();
        String total = "Total: " + internetOrdersManager.ordersCostSummary();
        totalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        ordersPanel.add(totalLabel);
        ordersLayout.putConstraint(SpringLayout.WEST, totalLabel, 40, SpringLayout.WEST, ordersPanel);
        ordersLayout.putConstraint(SpringLayout.NORTH, totalLabel, 10, SpringLayout.SOUTH, ordersListPanel);
        totalLabel.setText(total);
        return ordersPanel;
    }

    private JPanel getOrdersListPanel(OrdersManager ordersManager) {
        JPanel ordersListPanel = new JPanel(); //панель со списком заказов
        ordersListPanel.setLayout(new GridLayout(4, 1, 10, 30));
        for (int i = 0; i < 4; i++) {
            JPanel orderPanel = getInternetOrderPanel(i, ordersManager);//панель с одним заказом
            if (orderPanel != null) { //если заказ существует
                ordersListPanel.add(orderPanel); //добавляем его на панель
            } else { //если заказа нет
                orderPanel = new JPanel(); //создаем пустую панель
                orderPanel.setBackground(Color.white); //цвет фона
                orderPanel.setPreferredSize(new Dimension(200, 100)); //размер
                ordersListPanel.add(orderPanel); //добавляем на панель
            }
        }

        return ordersListPanel;
    }

    private JPanel getInternetOrderPanel(int index, OrdersManager ordersManager) {

        ArrayList<Order> orders = ordersManager.getOrders();
        if (index >= orders.size() || orders.get(index) == null) return null;
        else {
            JPanel orderPanel = new JPanel();
            SpringLayout internetOrderLayout = new SpringLayout();
            orderPanel.setLayout(internetOrderLayout);

            JLabel orderLabel = new JLabel();
            JLabel orderAddressLabel = new JLabel();
            JLabel orderItemsLabel = new JLabel();
            JLabel orderCostLabel = new JLabel("Cost: " + orders.get(index).costTotal());

            orderPanel.add(orderLabel);
            orderPanel.add(orderAddressLabel);
            orderPanel.add(orderItemsLabel);
            orderPanel.add(orderCostLabel);


            String orderText = "Order #" + (index + 1);
            orderLabel.setText(orderText);
            orderLabel.setFont(new Font("Arial", Font.BOLD, 10));


            String orderAddressLabelText = "Address: ";
            if (orders.get(index).getCustomer() != null) {
                orderAddressLabelText += orders.get(index).getCustomer().getAddress();
            } else {
                orderAddressLabelText += "null";
            }
            orderAddressLabel.setText(orderAddressLabelText);
            orderAddressLabel.setFont(new Font("Arial", Font.PLAIN, 10));


            StringBuilder orderItemsLabelText = new StringBuilder("Items: ");
            for (int i = 0; i < orders.get(index).itemsQuantity(); i++) {
                String itemName = orders.get(index).getItems().get(i).getName();
                orderItemsLabelText.append(itemName).append(", ");
            }
            orderItemsLabel.setText(orderItemsLabelText.toString());



            internetOrderLayout.putConstraint(SpringLayout.WEST, orderLabel, 10, SpringLayout.WEST, orderPanel);
            internetOrderLayout.putConstraint(SpringLayout.NORTH, orderLabel, 10, SpringLayout.NORTH, orderPanel);
            internetOrderLayout.putConstraint(SpringLayout.WEST, orderAddressLabel, 10, SpringLayout.WEST, orderPanel);
            internetOrderLayout.putConstraint(SpringLayout.NORTH, orderAddressLabel, 10, SpringLayout.SOUTH, orderLabel);
            internetOrderLayout.putConstraint(SpringLayout.WEST, orderItemsLabel, 10, SpringLayout.WEST, orderPanel);
            internetOrderLayout.putConstraint(SpringLayout.NORTH, orderItemsLabel, 10, SpringLayout.SOUTH, orderAddressLabel);
            internetOrderLayout.putConstraint(SpringLayout.WEST, orderCostLabel, 10, SpringLayout.WEST, orderPanel);
            internetOrderLayout.putConstraint(SpringLayout.NORTH, orderCostLabel, 10, SpringLayout.SOUTH, orderItemsLabel);

            orderPanel.setPreferredSize(new Dimension(200, 100));
            return orderPanel;
        }
    }


    public static void main(String[] args) {
        new Driver();
    }
}
