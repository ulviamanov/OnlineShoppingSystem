public class ElectronicsProduct extends Product {
    private String warrantyPeriod;
    private double voltage;

    // Constructor
    public ElectronicsProduct(String productId, String name, double price, int stockQuantity,
                              String warrantyPeriod, double voltage) {
        super(productId, name, price, stockQuantity); // Call to superclass (Product) constructor
        this.warrantyPeriod = warrantyPeriod;
        this.voltage = voltage;
    }

    // Getters and Setters for additional attributes
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    @Override
    public void reduceStock(int quantity) {
        // Custom implementation (if necessary)
        if (quantity > 0 && this.getStockQuantity() >= quantity) {
            super.reduceStock(quantity); // Call the superclass method
            // Additional logic specific to ElectronicsProduct (if any)
        } else {
            System.out.println("Invalid stock reduction or insufficient stock for ElectronicsProduct.");
        }
    }

    @Override
    public boolean isAvailable() {
        // Custom implementation (if necessary)
        // For instance, you might have different availability criteria for ElectronicsProduct
        return super.isAvailable(); // You can use the implementation from the superclass
    }
}

