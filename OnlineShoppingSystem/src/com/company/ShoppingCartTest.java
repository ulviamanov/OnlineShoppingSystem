import static org.junit.Assert.*;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("P1001", "Laptop", 1000.0, 10);
        cart.addItem(product1, 3);
        assertEquals(3, cart.getProductQuantity(product1));
    }
}
