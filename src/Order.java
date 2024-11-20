import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    public static void order() {
        Scanner sc = new Scanner(System.in);
        List<IceCreamShop.Item> order = new ArrayList<>();
        System.out.println("Welcome to the Ice Cream Shop!");
        System.out.println("Available Flavors:");
        IceCreamShop.flavors.forEach((key, value) -> System.out.println(key + " - $" + value.price));
        while(true) {
            System.out.print("Enter flavour name (or type 'done to finish'):");
            String flavor = sc.nextLine();
            if(flavor.equals("done")) break;
            if(flavor.contains(flavor)){
                System.out.print("Enter number of scoops:");
                int scoops = Integer.parseInt(sc.nextLine());
                for(int i = 0; i < scoops; i++){
                    flavor = "";
                    order.add(IceCreamShop.flavors.get(flavor));
                }
            } else {
                System.out.println("Invalid flavor!");
            }
        }
        IceCreamShop.toppings.forEach((key, value) -> System.out.println(key + " - $" + value.price));

        while (true) {
            System.out.println("Enter topping name (or type 'done' to finish):");
            String topping = sc.nextLine();
            if (topping.equalsIgnoreCase("done")) break;
            if (IceCreamShop.toppings.containsKey(topping)) {
                order.add(IceCreamShop.toppings.get(topping));
            } else {
                System.out.println("Invalid topping!");
            }
        }

        System.out.println("Choose serving option: (1) Paper Cup (2) Waffle Cone ($5.00 extra)");
        int servingOption = Integer.parseInt(sc.nextLine());
        double servingPrice = (servingOption == 2) ? 5.00 : 0.00;
        if (servingOption == 2) {
            order.add(new IceCreamShop.Item("Waffle Cone", servingPrice));
        }

        System.out.println("Choose serving option: (1) Paper Cup (2) Waffle Cone ($5.00 extra)");
        servingOption = Integer.parseInt(sc.nextLine());
        servingPrice = (servingOption == 2) ? 5.00 : 0.00;
        if (servingOption == 2) {
            order.add(new IceCreamShop.Item("Waffle Cone", servingPrice));
        }

    }
}
