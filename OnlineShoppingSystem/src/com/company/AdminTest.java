import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdminTest {
    private Admin admin;
    private Product product;
    private Customer customer;

    @Before
    public void setUp() {
        admin = new Admin("A001", "AdminName", "admin@example.com", "password123");
        product = new Product("P001", "Test Product", 100.0, 10);
        customer = new Customer("C001", "CustomerName", "customer@example.com");
    }

    @Test
    public void testAddProduct_NewProduct() {
        admin.addProduct(product);
        // Assuming you have a method to get a product by ID
        assertEquals(product, admin.getProductById("P001"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddProduct_NullProduct() {
        admin.addProduct(null);
    }

    @Test
    public void testRemoveProduct_ExistingProduct() {
        admin.addProduct(product);
        admin.removeProduct(product);
        // Assuming you have a method to check if a product exists
        assertFalse(admin.doesProductExist("P001"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveProduct_NonExistingProduct() {
        admin.removeProduct(new Product("P002", "Non Existing", 200.0, 5));
    }

    @Test
    public void testAddCustomer_NewCustomer() {
        admin.addCustomer(customer);
        // Assuming you have a method to get a customer by ID
        assertEquals(customer, admin.getCustomerById("C001"));
    }

    // More test methods...

}
