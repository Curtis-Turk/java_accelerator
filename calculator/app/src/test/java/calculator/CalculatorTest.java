package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  @Test
  public void testAddsTwoAndTwo() {
    Calculator calc = new Calculator();
    byte int1 = 2;
    byte int2 = 2;
    Float expected2 = 4.0f;

    assertEquals("2 + 2 should equal 4", expected2, calc.add(int1, int2));
  }
}
