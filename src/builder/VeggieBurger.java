package builder;

public class VeggieBurger extends Burger {
    @Override
    public String name() {
        return "Veggie Burger";
    }

    @Override
    public float price() {
        return 1.00f;
    }
}

