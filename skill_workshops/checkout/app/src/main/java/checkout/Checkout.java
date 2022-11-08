package checkout;

public class Checkout {
    public Integer checkout(String inputSKUs){
        Integer total = 0;
        Integer aCount = 0;
        Integer bCount = 0;
        for (int i = 0; i < inputSKUs.length(); i++) {
            if (inputSKUs.charAt(i) == 'A') {
                aCount++;
                total += 50;
            } else if (inputSKUs.charAt(i) == 'B') {
                bCount++;
                total += 30;
            } else if (inputSKUs.charAt(i) == 'C') {
                total += 20;
            } else if (inputSKUs.charAt(i) == 'D') {
                total += 15;
            } else
                return -1;
        }
        if(aCount > 2) {
            for (int i = 1; i < aCount; i += 3) {
                total -= 20;
            }
        }
        if(bCount > 1) {
            for (int i = 1; i < bCount; i += 2) {
                total -= 15;
            }
        }
        return total;
    }
}
