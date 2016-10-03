package flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Menu acts like a factory and cache for CoffeeFlavor flyweight objects
public class Menu {
    private Map<String, CoffeeFlavor> flavor = new ConcurrentHashMap<>();

    CoffeeFlavor lookup(String flavorName) {
        if (!flavor.containsKey(flavorName))
            flavor.put(flavorName, new CoffeeFlavor(flavorName));
        return flavor.get(flavorName);
    }

    public int totalCoffeeFlavorsMade() {
        return flavor.size();
    }
}
