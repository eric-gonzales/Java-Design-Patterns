package flyweight;

public class Order {
    private final int tableNumber;
    private final CoffeeFlavor flavor;

    Order(int tableNumber, CoffeeFlavor flavor) {
        this.tableNumber = tableNumber;
        this.flavor = flavor;
    }

    public void serve() {
        System.out.println("Serving " + flavor + " to table " + tableNumber);
    }
}
