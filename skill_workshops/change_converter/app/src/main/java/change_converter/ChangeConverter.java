package change_converter;

import java.util.ArrayList;

public class ChangeConverter {
    public static ArrayList<String> changeList = new ArrayList<>();
    public double amountLeft = 0.00;

    public ArrayList<String> convert(double inputNumber) {
        inputNumber *= 100;
        amountLeft = inputNumber;
        addChange("£2", 200);
        addChange("£1", 100);
        addChange("50p", 50);
        addChange("10p", 10);
        addChange("5p", 5);
        addChange("2p", 2);
        addChange("1p",1);
        return changeList;
    }
    public void addChange(String changeString, int changeValue){
        int change = Math.round((int)amountLeft/changeValue);
        amountLeft -= change * changeValue;
        for (int i = 0; i < change ; i++) {
            changeList.add(changeString);
        }
    }
}
