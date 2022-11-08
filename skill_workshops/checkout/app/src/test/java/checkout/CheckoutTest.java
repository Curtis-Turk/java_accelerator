package checkout;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckoutTest {
    public static Checkout shop = new Checkout();
    @Test
    public void checkoutA(){
        assertEquals(shop.checkout("A"), 50);
    }
    @Test
    public void checkoutAA(){
        assertEquals(shop.checkout("AA"), 100);
    }
    @Test
    public void checkoutB(){
        assertEquals(shop.checkout("B"), 30);
    }
    @Test
    public void checkoutAB(){
        assertEquals(shop.checkout("AB"), 80);
    }
    @Test
    public void checkoutC(){
        assertEquals(shop.checkout("C"), 20);
    }
    @Test
    public void checkoutD(){
        assertEquals(shop.checkout("D"), 15);
    }
    @Test
    public void errorCheckForNonCapital(){
        assertEquals(shop.checkout("d"), -1);
    }
    @Test
    public void errorCheckForNonCapitalAtStart(){
        assertEquals(shop.checkout("daaC"), -1);
    }
    @Test
    public void dealFor3A(){
        assertEquals(shop.checkout("AAA"), 130);
    }
    @Test
    public void dealFor2B(){
        assertEquals(shop.checkout("BB"), 45);
    }
}
