package leap_years_gradle;
//import java.util.ArrayList;

public class LeapYears{
    public Boolean isLeapYear(int inputYear){
        return (inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0);
    }
//    public ArrayList allLeapYears(int yearFrom, int yearTo){
//        return new ArrayList();
//    }
}
