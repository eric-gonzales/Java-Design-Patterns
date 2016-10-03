package flyweight;

//Instances of CoffeeFlavor will be the Flyweights
public class CoffeeFlavor {
    private final String name;

    CoffeeFlavor(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}
