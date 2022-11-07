package leap_years_gradle;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearsTest {
    @Test
    public void trueIf400() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(400), true);
    }

    @Test
    public void falseIf401() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(401), false);
    }

    @Test
    public void falseIfNotDivisibeBy4() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(5), false);
    }

    @Test
    public void trueIfDivisibleBy4() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(4), true);
    }

    @Test
    public void firstExample() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(2000), true);
    }

    @Test
    public void secondExample() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(1970), false);
    }

    @Test
    public void thirdExample() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(1900), false);
    }

    @Test
    public void fourthExample() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(1988), true);
    }

    @Test
    public void fifthExample() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(1500), false);
    }

    @Test
    public void div4NotBy100() {
        LeapYears ly = new LeapYears();
        assertEquals(ly.isLeapYear(2004), true);
    }

    @Test
    public void returnFirstLeapYear() {
        LeapYears ly = new LeapYears();
        ArrayList<Integer> correctYears = new ArrayList<Integer>();
        correctYears.add(4);

        assertEquals(ly.allLeapYears(0, 5), correctYears);
    }

    @Test
    public void returnFirstThreeLeapYear() {
        LeapYears ly = new LeapYears();
        ArrayList<Integer> correctYears = new ArrayList<Integer>();
        correctYears.add(4);
        correctYears.add(8);
        correctYears.add(12);
        assertEquals(ly.allLeapYears(0, 12), correctYears);
    }

    @Test
    public void returnsRandomThreeLeapYear() {
        LeapYears ly = new LeapYears();
        ArrayList<Integer> correctYears = new ArrayList<Integer>();
        correctYears.add(2020);
        correctYears.add(2024);
        correctYears.add(2028);
        correctYears.add(2032);
        assertEquals(ly.allLeapYears(2020, 2032), correctYears);
    }
}
