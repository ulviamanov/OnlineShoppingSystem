import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest {

    @Test
    public void testReduceStock() {
        Product product = new Product("P1001", "Laptop", 1000.0, 10);
        product.reduceStock(5);
        assertEquals(5, product.getStockQuantity());
    }
}
