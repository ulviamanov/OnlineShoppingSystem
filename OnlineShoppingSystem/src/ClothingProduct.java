public class ClothingProduct extends Product {
    private String size;
    private String material;

    public ClothingProduct(String productId, String name, double price, int stockQuantity,
                           String size, String material) {
        super(productId, name, price, stockQuantity); // Call to superclass (Product) constructor
        this.size = size;
        this.material = material;
    }

    // Getters and setters for size and material
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Additional clothing-specific methods can be added here
    // ...
}


