import java.util.Map;

public class IceCreamShop {

    static class Item {
        String name;
        double price;

        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static final Map<String, Item> flavors = Map.of(
            "Mint Chocolate Chip", new Item("Mint Chocolate Chip", 2.80),
            "Chocolate Fudge", new Item("Chocolate Fudge", 3.00),
            "Strawberry Swirl", new Item("Strawberry Swirl", 2.75),
            "Pistachio Delight", new Item("Pistachio Delight", 3.25)
    );
    public static final Map<String, Item > toppings = Map.of(
            "Sprinkles", new Item("Sprinkles", 0.30),
            "Marshmallow", new Item("Marshmallow", 0.70),
            "Crushed Oreo", new Item("Crushed Oreo", 0.85),
            "Fresh Strawberries", new Item("Fresh Strawberries", 1.00),
            "Chocolate Chips", new Item("Chocolate Chips", 0.50)
    );




}
