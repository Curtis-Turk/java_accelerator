package checkout;

public class Checkout {
    public Integer checkout(String inputSKUs){
        Integer total = 0;
        for (int i = 0; i < inputSKUs.length(); i++) {
           if(inputSKUs.charAt(i) == 'A'){
               total += 50;
           }else if(inputSKUs.charAt(i) == 'B') {
               total += 30;
           }else
               total += 20;
        }
        return total;
    }
}
