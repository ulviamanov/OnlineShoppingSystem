import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        items = new HashMap<>();
    }

    public void addItem(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotal() {
        return items.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
    }

    public void clear() {
        items.clear();
    }

    // Getter for items
    public Map<Product, Integer> getItems() {
        return items;
    }

    public boolean containsProduct(Product product) {

        return items.containsKey(product);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public CharSequence getShoppingCart() {
        if (items.isEmpty()) {
            return "Shopping Cart is empty.";
        }

        StringBuilder cartContents = new StringBuilder();
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            cartContents.append(product.getName())
                    .append(" - Quantity: ")
                    .append(quantity)
                    .append(", Price: $")
                    .append(product.getPrice())
                    .append("\n");
        }
        return cartContents;
    }
}
