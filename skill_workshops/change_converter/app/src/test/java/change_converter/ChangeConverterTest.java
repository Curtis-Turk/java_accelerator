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
 public void test(){
     System.out.println(actual);
 }
}
