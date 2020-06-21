package bartender;

public class Drink {
    private String name;
    private double price;
    private boolean containsAlcohol;

    public Drink(String name, double price, boolean containsAlcohol) {
        this.name = name;
        this.price = price;
        this.containsAlcohol = containsAlcohol;
    }

    public double getPrice() {
        return price;
    }

    public boolean getContainsAlcohol() {
        return containsAlcohol;
    }
}
