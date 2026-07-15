import java.util.*;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Coffee (espresso/latte/cappuccino) or exit: ");
            String coffee = sc.next();

            if (coffee.equalsIgnoreCase("exit"))
                break;

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            int price = 0;

            switch (coffee) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
            }

            double bill = price * qty;
            double total = bill + (bill * 18 / 100);

            System.out.println("Total Bill = " + total);
        }
    }
}