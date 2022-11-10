package change_converter;

import java.util.ArrayList;

public class ChangeConverter {
    public static ArrayList<String> changeList = new ArrayList<>();
    public double amountLeft = 0.00;

    public ArrayList<String> convert(double inputNumber) {
        double roundPence = Math.round(inputNumber * 100);
        amountLeft += roundPence;
        addChange("£50", 5000);
        addChange("£20", 2000);
        addChange("£10", 1000);
        addChange("£5", 500);
        addChange("£2", 200);
        addChange("£1", 100);
        addChange("50p", 50);
        addChange("20p", 20);
        addChange("10p", 10);
        addChange("5p", 5);
        addChange("2p", 2);
        addChange("1p", 1);
        return changeList;
    }

    public void addChange(String changeString, int changeValue) {
        int change = Math.round((int) amountLeft / changeValue);
        amountLeft -= change * changeValue;
        for (int i = 0; i < change; i++) {
            changeList.add(changeString);
        }
    }
}
