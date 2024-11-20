package Class;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Invoice {
    public static boolean generateInvoice(List<IceCreamShop.Item> order, double subtotal, double tax, double total) {
        try (FileWriter writer = new FileWriter("Class.Invoice.txt")) {
            writer.write("Ice Cream Shop Class.Invoice\n");
            Map<String, Integer> itemCount = new LinkedHashMap<>();
            for (IceCreamShop.Item item : order) {
                itemCount.put(item.name, itemCount.getOrDefault(item.name, 0) + 1);
            }
            for (Map.Entry<String, Integer> entry : itemCount.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + " time(s): $" +
                        String.format("%.2f", entry.getValue() * (IceCreamShop.flavors.containsKey(entry.getKey())
                                ? IceCreamShop.flavors.get(entry.getKey()).price
                                : IceCreamShop.toppings.getOrDefault(entry.getKey(), new IceCreamShop.Item("", 0)).price)) + "\n");
            }
            writer.write("Subtotal: $" + String.format("%.2f", subtotal) + "\n");
            writer.write("Tax: $" + String.format("%.2f", tax) + "\n");
            writer.write("Total Amount Due: $" + String.format("%.2f", total) + "\n");
            return true;
        } catch (IOException e) {
            System.out.println("Error generating invoice: " + e.getMessage());
        }
        return false;
    }

}


