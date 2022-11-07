package leap_years_gradle;
import java.util.ArrayList;

public class LeapYears{
    public Boolean isLeapYear(int inputYear){
        if(inputYear <= 0){
            return false;
        }
        return (inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 400 == 0);
    }
    public ArrayList<Integer> allLeapYears(int yearFrom, int yearTo){
        ArrayList<Integer> leapYears = new ArrayList<Integer>();
        for(int i = yearFrom; i <= yearTo; i++){
           if(isLeapYear(i)){
               leapYears.add(i);
           }
        }
        return leapYears;
    }
}

