package leap_years_gradle;

public class LeapYears{
    public Boolean isLeapYear(int num){
        if(num % 4 == 0){
            return true;
        }
        return false;
    }
}
