public class Customer extends User {
    private ShoppingCart shoppingCart;

    public Customer(String userId, String name, String email) {
        super(userId, name, email);
        this.shoppingCart = new ShoppingCart();
    }

    public void addToCart(Product product, int quantity) {
        if (product != null && quantity > 0) {
            shoppingCart.addItem(product, quantity);
            System.out.println(quantity + " " + product.getName() + "(s) added to the cart.");
        } else {
            System.out.println("Invalid product or quantity.");
        }
    }

    public void removeFromCart(Product product) {
        if (product != null && shoppingCart.containsProduct(product)) {
            shoppingCart.removeItem(product);
            System.out.println(product.getName() + " removed from the cart.");
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    public Order placeOrder() {
        if (!shoppingCart.isEmpty()) {
            Order newOrder = new Order(this, shoppingCart);
            shoppingCart.clear();
            System.out.println("Order placed successfully.");
            return newOrder;
        } else {
            System.out.println("Shopping cart is empty.");
            return null;
        }
    }
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
    // Rest of the Customer class...
}


