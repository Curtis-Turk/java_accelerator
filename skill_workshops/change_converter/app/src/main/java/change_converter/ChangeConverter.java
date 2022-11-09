package change_converter;

import java.util.ArrayList;

public class ChangeConverter {
    public static ArrayList<String> change = new ArrayList<>();
    public double amountLeft = 0.00;
    public ArrayList<String> convert(double inputNumber){
        amountLeft = inputNumber;
        while(amountLeft > 0.00) {
            if(isBetween(amountLeft, 0.05, 0.09)){
                change.add("5p");
                amountLeft -= 0.05;
            }
            else if  (isBetween(amountLeft,0.02,0.04)) {
                change.add("2p");
                amountLeft -= 0.02;
            } else if(isBetween(amountLeft,0.01,0.01)){
                change.add("1p");
                amountLeft -= 0.01;
            }
        }
        return change;
    }
    public static boolean isBetween(double x, double lower, double upper) {
        return lower <= x && x <= upper;
    }
}
