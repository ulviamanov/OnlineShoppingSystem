public class Main {
    public static void main(String[] args) {
        // Create a few products
        Product product1 = new Product("P1001", "Laptop", 1000.0, 10);
        Product product2 = new Product("P1002", "Smartphone", 500.0, 20);

        // Create an admin and add products to inventory (simulated)
        Admin admin = new Admin("A101", "AdminUser", "admin@example.com", "adminPass");
        admin.addProduct(product1);
        admin.addProduct(product2);

        // Create a customer
        Customer customer = new Customer("C101", "John Doe", "johndoe@example.com");

        // Customer adds products to their shopping cart
        customer.addToCart(product1, 2); // Adding 2 Laptops
        customer.addToCart(product2, 1); // Adding 1 Smartphone

        // Customer places an order
        Order order = customer.placeOrder();

        // Check if the order was successful and if the cart is now empty
        if (order != null && customer.getShoppingCart().isEmpty()) {
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order failed or shopping cart is not empty.");
        }

        // More operations can be added here (like displaying order details, etc.)
        System.out.println(customer.getShoppingCart().getShoppingCart());
    }
}

