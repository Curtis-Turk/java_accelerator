package checkout;

public class Checkout {
    public Integer checkout(String inputSKUs){
        int total = 0;
        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < inputSKUs.length(); i++) {
            switch (inputSKUs.charAt(i)) {
                case 'A':
                    aCount++; total += 50; break;
                case 'B':
                    bCount++; total += 30; break;
                case 'C':
                    total += 20; break;
                case 'D':
                    total += 15; break;
                default:
                    return -1;
            }
        }

        for (int i = 1; i < aCount; i += 3) {
                if(aCount > 2) total -= 20;
            }

        for (int i = 1; i < bCount; i += 2) {
                if(bCount > 1) total -= 15;
        }
        return total;
    }
}
