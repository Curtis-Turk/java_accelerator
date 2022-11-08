package checkout;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckoutTest {
    @Test
    public void checkoutA(){
        Checkout shop = new Checkout();
        assertEquals(shop.checkout("A"), 50);
    }
    @Test
    public void checkoutAA(){
        Checkout shop = new Checkout();
        assertEquals(shop.checkout("AA"), 100);
    }
    @Test
    public void checkoutB(){
        Checkout shop = new Checkout();
        assertEquals(shop.checkout("B"), 30);
    }
    @Test
    public void checkoutAB(){
        Checkout shop = new Checkout();
        assertEquals(shop.checkout("AB"), 80);
    }
    @Test
    public void checkoutC(){
        Checkout shop = new Checkout();
        assertEquals(shop.checkout("C"), 20);
    }
}
