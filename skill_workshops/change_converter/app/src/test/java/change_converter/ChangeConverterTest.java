package change_converter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class ChangeConverterTest {

    public static ChangeConverter change = new ChangeConverter();
    public static ArrayList<String> actual = new ArrayList<>();
//@AfterEach

 @Test
    public void format1p(){
     actual.add("1p");
    assertEquals(change.convert(0.01), actual);
 }
 @Test
 public void twoPence(){
     actual.add("2p");
     assertEquals(change.convert(0.02), actual);
 }
    @Test
    public void threePence(){
        actual.add("2p");
        actual.add("1p");
        assertEquals(change.convert(0.03), actual);
    }
    @Test
    public void fourPence(){
        actual.add("2p");
        actual.add("2p");
        assertEquals(change.convert(0.04), actual);
    }
    @Test
    public void fivePence(){
        actual.add("5p");
        assertEquals(change.convert(0.05), actual);
    }
    @Test
    public void ninePence(){
        actual.add("5p");
        actual.add("2p");
        actual.add("2p");
        assertEquals(change.convert(0.09), actual);
    }
    @Test
    public void tenPence(){
        actual.add("10p");
        assertEquals(change.convert(0.10), actual);
    }
    @Test
    public void twentyPence(){
        actual.add("20p");
        assertEquals(change.convert(0.20), actual);
    }
    @Test
    public void fiftyPence(){
        actual.add("50p");
        assertEquals(change.convert(0.50), actual);
    }
    @Test
    public void pound(){
        actual.add("£1");
        assertEquals(change.convert(1), actual);
    }
    @Test
    public void twoPound(){
        actual.add("£2");
        assertEquals(change.convert(2), actual);
    }

    @Test
    public void fivePound(){
        actual.add("£5");
        assertEquals(change.convert(5), actual);
    }
    @Test
    public void tenPound(){
        actual.add("£10");
        assertEquals(change.convert(10), actual);
    }
    @Test
    public void twentyPound(){
        actual.add("£20");
        assertEquals(change.convert(20), actual);
    }
    @Test
    public void fiftyPound(){
        actual.add("£50");
        assertEquals(change.convert(50), actual);
    }
    @Test
    public void a1999test(){
        ArrayList<String> test = new ArrayList<>();
        Collections.addAll(test,"£10", "£5", "£2", "£2", "50p", "20p", "20p", "5p", "2p", "2p");
        assertEquals(change.convert(19.99), test);
    }
    @Test
    public void a7681test(){
        ArrayList<String> test = new ArrayList<>();
        Collections.addAll(test,"£50", "£20", "£5", "£1", "50p", "20p", "10p", "1p");
        assertEquals(change.convert(76.81), test);
    }
}
