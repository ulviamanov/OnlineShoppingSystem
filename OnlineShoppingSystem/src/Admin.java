import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class Admin extends User {
    private String password;
    // Assuming we have some data structures to hold products and customers
    private Map<String, Product> products; // Keyed by product ID
    private List<Customer> customers;

    public Admin(String userId, String name, String email, String password) {
        super(userId, name, email);
        this.password = password;
        this.products = products;
        this.customers = customers;
    }

    public void addProduct(Product product) {
        if (product != null && !products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
            System.out.println("Product added: " + product.getName());
        } else {
            System.out.println("Product is null or already exists.");
        }
    }

    public void removeProduct(Product product) {
        if (product != null && products.containsKey(product.getProductId())) {
            products.remove(product.getProductId());
            System.out.println("Product removed: " + product.getName());
        } else {
            System.out.println("Product is null or does not exist.");
        }
    }

    public void updateProductStock(Product product, int newStock) {
        if (product != null && products.containsKey(product.getProductId()) && newStock >= 0) {
            product.setStockQuantity(newStock);
            System.out.println("Updated stock for " + product.getName() + " to " + newStock);
        } else {
            System.out.println("Product is null, does not exist, or new stock is invalid.");
        }
    }

    public void removeCustomer(Customer customer) {
        if (customer != null && customers.contains(customer)) {
            customers.remove(customer);
            System.out.println("Customer removed: " + customer.getName());
        } else {
            System.out.println("Customer is null or does not exist.");
        }
    }

    // Rest of the Admin class...
}

