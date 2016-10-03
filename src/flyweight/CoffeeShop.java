package flyweight;

import java.util.List;
import java.util.Vector;

public class CoffeeShop {
    private final List<Order> orders = new Vector<>();
    private final Menu menu = new Menu();

    public void takeOrder(String flavorName, int table) {
        CoffeeFlavor flavor = menu.lookup(flavorName);
        Order order = new Order(table, flavor);
        orders.add(order);
    }

    public void service() {
        for (Order order : orders){
            order.serve();
        }
    }

    String report() {
        return "total CoffeeFlavor objects made: "
                + menu.totalCoffeeFlavorsMade();
    }
}
