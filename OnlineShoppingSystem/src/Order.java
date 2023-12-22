import java.util.Date;
import java.util.Map;

public class Order {
    private String orderId;
    private Customer customer;
    private Date orderDate;
    private Map<Product, Integer> items;
    private double totalAmount;

    public Order(Customer customer, ShoppingCart cart) {
        this.orderId = generateOrderId();
        this.customer = customer;
        this.orderDate = new Date();
        this.items = cart.getItems();
        this.totalAmount = cart.calculateTotal();
    }

    private String generateOrderId() {
        // This can be more complex in a real system
        return String.valueOf(orderDate.getTime());
    }

    public String generateInvoice() {
        // Implementation can vary, but it can return a formatted string for the invoice
        StringBuilder invoice = new StringBuilder();
        invoice.append("Order ID: ").append(orderId).append("\n");
        invoice.append("Customer: ").append(customer.name).append("\n");
        invoice.append("Date: ").append(orderDate).append("\n");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            invoice.append(product.name).append(" x ").append(quantity).append(" = $").append(product.price * quantity).append("\n");
        }
        invoice.append("Total: $").append(totalAmount);
        return invoice.toString();
    }
}
