import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderTest {
    private Order order;
    private Product product1;
    private Product product2;
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("C001", "CustomerName", "customer@example.com");
        order = new Order("O001", customer);
        product1 = new Product("P001", "Laptop", 1000.0, 10);
        product2 = new Product("P002", "Phone", 500.0, 20);
    }

    @Test
    public void testGenerateInvoice_WithProducts() {
        order.addItem(product1, 1);
        order.addItem(product2, 2);
        String invoice = order.generateInvoice();
        assertTrue(invoice.contains("Laptop"));
        assertTrue(invoice.contains("Phone"));
        assertTrue(invoice.contains("Total Amount: $2000.0"));
    }

    @Test
    public void testGenerateInvoice_EmptyOrder() {
        String invoice = order.generateInvoice();
        assertEquals("Order is empty.", invoice);
    }
}

