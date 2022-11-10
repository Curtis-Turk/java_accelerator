package change_converter;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChangeConverterTest {

    public static ChangeConverter change = new ChangeConverter();
    public static ArrayList<String> actual = new ArrayList<>();

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
    public void fiftyPence(){
        actual.add("50p");
        assertEquals(change.convert(0.50), actual);
    }
}
