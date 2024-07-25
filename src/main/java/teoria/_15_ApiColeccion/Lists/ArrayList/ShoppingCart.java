package teoria._15_ApiColeccion.Lists.ArrayList;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void displayItems() {
        System.out.println("Shopping Cart Items:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop");
        cart.addItem("Mouse");
        cart.addItem("Keyboard");
        cart.removeItem("Mouse");
        cart.displayItems();
    }
}
