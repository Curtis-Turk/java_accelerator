package leap_years_gradle;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearsTest {
    @Test
    public void trueIf400(){
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(400), true);
    }
    @Test
    public void falseIf401(){
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(401), false);
    }
    @Test
    public void falseIfNotDivisibeBy4(){
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(5), false);
    }
    @Test
    public void trueIfDivisibleBy4(){
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(4), true);
    }
    @Test
    public void firstExample(){
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(2000), true);
    }
    @Test
    public void secondExample(){
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(1970), false);
    }
    @Test
    public void thirdExample(){
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(1900), false);
    }
}
