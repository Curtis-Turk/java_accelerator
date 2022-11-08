package checkout;

public class Checkout {
    public Integer checkout(String inputSKUs){
        Integer total = 0;
        for (int i = 0; i < inputSKUs.length(); i++) {
           if(inputSKUs.charAt(i) == 'A'){
               total += 50;
           }else
               total += 30;
        }
        return total;
    }
}
