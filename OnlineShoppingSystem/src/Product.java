public class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    // Constructor
    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }


    // Method to reduce stock
    public void reduceStock(int quantity) {
        // Check to ensure we're not reducing stock below zero
        if (quantity > 0 && this.stockQuantity >= quantity) {
            this.stockQuantity -= quantity;
        } else {
            System.out.println("Invalid stock reduction or insufficient stock.");
        }
    }

    // Method to check if product is available (stock is more than 0)
    public boolean isAvailable() {
        return this.stockQuantity > 0;
    }

    public double getPrice() {
        return price;
    }

    // Getter for productId
    public String getProductId() {
        return productId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for stockQuantity
    public int getStockQuantity() {
        return stockQuantity;
    }
    // Setter for productId
    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for price
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Setter for stockQuantity
    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("Stock quantity cannot be negative.");
        }
    }
}
