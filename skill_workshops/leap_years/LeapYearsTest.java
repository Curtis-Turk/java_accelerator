import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearsTest {
@Test
    public void trueIf400(){
    LeapYears ly = new LeapYears();
    assertEquals(ly.isLeapYear(400), true);
}
}